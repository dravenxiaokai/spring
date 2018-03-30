package junit.test;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

/**
 * Draven版容器
 * 
 * @author dravenxiaokai
 *
 */
public class DravenClassPathXMLApplicationContext {
	private List<BeanDefinition> beanDefinitions = new ArrayList<BeanDefinition>();
	private Map<String, Object> singletons = new HashMap<>();

	public DravenClassPathXMLApplicationContext(String filename) {
		this.readXML(filename);
		this.instanceBeans();
	}

	/**
	 * 完成bean的实例化
	 */
	private void instanceBeans() {
		for (BeanDefinition beanDefinition : beanDefinitions) {
			try {
				if (beanDefinition.getClassName() != null && !"".equals(beanDefinition.getClassName().trim()))
					singletons.put(beanDefinition.getId(), Class.forName(beanDefinition.getClassName()).newInstance());
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 读取XML文件
	 * 
	 * @param filename
	 */
	private void readXML(String filename) {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			URL xmlpath = this.getClass().getClassLoader().getResource(filename);
			document = saxReader.read(xmlpath);
			Map<String, String> nsMap = new HashMap<>();
			// 加入命名空间
			nsMap.put("ns", "http://www.springframework.org/schema/beans");
			// 创建beans/bean查询路径
			XPath xPath = document.createXPath("//ns:beans/ns:bean");
			// 设置命名空间
			xPath.setNamespaceURIs(nsMap);
			// 获取文档下所有bean节点
			List<Element> beans = xPath.selectNodes(document);
			for (Element element : beans) {
				String id = element.attributeValue("id");// 获取id属性值
				String clazz = element.attributeValue("class");// 获取class属性值
				BeanDefinition beanDefinition = new BeanDefinition(id, clazz);
				beanDefinitions.add(beanDefinition);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取bean实例
	 * 
	 * @param beanName
	 * @return
	 */
	public Object getBean(String beanName) {
		return this.singletons.get(beanName);
	}
}
