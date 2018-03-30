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

	@Test
	public void instanceSpring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService) ctx.getBean("personService");
		personService.save();
	}
}
