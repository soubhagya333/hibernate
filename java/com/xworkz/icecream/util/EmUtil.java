package com.xworkz.icecream.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {

	private static EntityManagerFactory factory =null;

	public static EntityManagerFactory getFactory() {
		if(factory!=null)
		return factory;
		else {
			System.out.println("failed");
			return null;
		}
	}

	static {
		try {
			factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occured");
		}
	}

}
