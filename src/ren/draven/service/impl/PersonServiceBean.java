package ren.draven.service.impl;

import ren.draven.service.PersonService;

public class PersonServiceBean implements PersonService {

	/* (non-Javadoc)
	 * @see ren.draven.service.impl.PersonService#save()
	 */
	@Override
	public void save() {
		System.out.println("我是save方法");
	}
}
