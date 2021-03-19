package com.xworkz.icecream.tester;

import com.xworkz.icecream.repository.IceRepository;
import com.xworkz.icecream.repository.IceRepositoryImpl;

public class GetPriceByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceRepository rep=new IceRepositoryImpl();
		double dao=rep.getPriceByName("orange");
		System.out.println(dao);

	}

}
