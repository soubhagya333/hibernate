package com.xworkz.icecream.tester;

import java.util.List;

import com.xworkz.icecream.repository.IceRepository;
import com.xworkz.icecream.repository.IceRepositoryImpl;

public class GetNameAndFlavourByPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceRepository rep=new IceRepositoryImpl();
		List<Object[]> dao=rep.getNameAndFlavourByPrice(200);
		
		System.out.println(dao);
		dao.forEach(a->System.out.println(a[0]));
		dao.forEach(a->System.out.println(a[1]));
	}

}
