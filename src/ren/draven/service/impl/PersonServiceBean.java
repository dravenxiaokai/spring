package ren.draven.service.impl;

import ren.draven.dao.PersonDao;
import ren.draven.service.PersonService;

public class PersonServiceBean implements PersonService {
	private PersonDao personDao;

	public void init() {
		System.out.println("初始化");
	}
	public PersonServiceBean() {
		System.out.println("我被实例化了");
	}
	@Override
	public void save() {
		System.out.println("我是save方法");
		personDao.add();
	}
	public void destroy() {
		System.out.println("关闭打开的资源");
	}
	public PersonDao getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
