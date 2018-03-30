package ren.draven.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import ren.draven.dao.PersonDao;
import ren.draven.service.PersonService;

public class PersonServiceBean implements PersonService {
	private PersonDao personDao;
	private Set<String> sets = new HashSet<>();
	private List<String> lists = new ArrayList<>();
	private Properties properties = new Properties();
	private Map<String, String> maps = new HashMap<>();

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

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
}
