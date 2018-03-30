package ren.draven.service.impl;

public class PersonServiceBeanFactory {
	/**
	 * 使用静态方法实例化bean
	 * @return
	 */
	public static PersonServiceBean createPersonServiceBean() {
		return new PersonServiceBean();
	}
	/**
	 * 使用实例工厂方法实例化bean
	 * @return
	 */
	public PersonServiceBean createPersonServiceBean2() {
		return new PersonServiceBean();
	}
}
