package ren.draven.dao.impl;

import ren.draven.dao.PersonDao;

public class PersonDaoBean implements PersonDao {
@Override
public void add() {
	System.out.println("执行PersonDaoBean中的add()方法");
}
}
