package com.xworkz.icecream.tester;

import com.xworkz.icecream.repository.IceRepository;
import com.xworkz.icecream.repository.IceRepositoryImpl;

public class UpdateTester {
	public static void main(String[] args) {
		
	
	IceRepository rep=new IceRepositoryImpl();
	rep.updatePriceByName("orange", 200);
	System.out.println(rep);
	}
}
