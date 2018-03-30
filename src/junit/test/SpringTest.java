package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ren.draven.service.PersonService;

public class SpringTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	// @Test
	// public void instanceSpring() {
	// ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	// PersonService personService = (PersonService) ctx.getBean("personService");
	// personService.save();
	// }
	// @Test
	// public void instanceSpring1() {
	// DravenClassPathXMLApplicationContext ctx1 = new
	// DravenClassPathXMLApplicationContext("beans.xml");
	// PersonService personService = (PersonService) ctx1.getBean("personService");
	// personService.save();
	// }
	// //使用静态工厂方法实例化bean
	// @Test
	// public void instanceSpring2() {
	// ApplicationContext ctx2 = new ClassPathXmlApplicationContext("beans.xml");
	// PersonService personService = (PersonService) ctx2.getBean("personService2");
	// personService.save();
	// }
	// //使用实例工厂方法实例化bean
	// @Test
	// public void instanceSpring3() {
	// ApplicationContext ctx3 = new ClassPathXmlApplicationContext("beans.xml");
	// PersonService personService = (PersonService) ctx3.getBean("personService3");
	// personService.save();
	// }
	// @Test
	// public void instanceSpring4() {
	// ApplicationContext ctx4 = new ClassPathXmlApplicationContext("beans.xml");
	// PersonService personService1 = (PersonService) ctx4.getBean("personService");
	// PersonService personService2 = (PersonService) ctx4.getBean("personService");
	// //获取的bean默认是单实例
	// System.out.println(personService1==personService2);
	// }
	// @Test
	// public void instanceSpring5() {
	// AbstractApplicationContext ctx5 = new
	// ClassPathXmlApplicationContext("beans.xml");
	// PersonService personService = (PersonService) ctx5.getBean("personService");
	// personService.save();
	// ctx5.close();
	// }
//	@Test
//	public void instanceSpring6() {
//		AbstractApplicationContext ctx6 = new ClassPathXmlApplicationContext("beans.xml");
//		PersonService personService = (PersonService) ctx6.getBean("personService");
//		System.out.println("=======set=========");
//		for (String value : personService.getSets()) {
//			System.out.println(value);
//		}
//		System.out.println("========list========");
//		for (String value : personService.getLists()) {
//			System.out.println(value);
//		}
//		System.out.println("========properties========");
//		for (Object key : personService.getProperties().keySet()) {
//			System.out.println(key + "=" + personService.getProperties().getProperty((String) key));
//		}
//		System.out.println("========maps========");
//		for (String key : personService.getMaps().keySet()) {
//			System.out.println(key+"="+personService.getMaps().get(key));
//		}
//		ctx6.close();
//	}
	@Test
	public void instanceSpring7() {
		AbstractApplicationContext ctx7 = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService) ctx7.getBean("personService");
		personService.save();
		ctx7.close();
	}
}
