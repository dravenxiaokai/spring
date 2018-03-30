package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ren.draven.service.PersonService;

public class SpringTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

//	@Test
//	public void instanceSpring() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		PersonService personService = (PersonService) ctx.getBean("personService");
//		personService.save();
//	}
//	@Test
//	public void instanceSpring1() {
//		DravenClassPathXMLApplicationContext ctx1 = new DravenClassPathXMLApplicationContext("beans.xml");
//		PersonService personService = (PersonService) ctx1.getBean("personService");
//		personService.save();
//	}
//	//使用静态工厂方法实例化bean
//	@Test
//	public void instanceSpring2() {
//		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("beans.xml");
//		PersonService personService = (PersonService) ctx2.getBean("personService");
//		personService.save();
//	}
	//使用实例工厂方法实例化bean
	@Test
	public void instanceSpring3() {
		ApplicationContext ctx3 = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService) ctx3.getBean("personService");
		personService.save();
	}
}
