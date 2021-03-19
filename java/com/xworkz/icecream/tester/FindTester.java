package com.xworkz.icecream.tester;

import com.xworkz.icecream.entity.IceEntity;
import com.xworkz.icecream.repository.IceRepository;
import com.xworkz.icecream.repository.IceRepositoryImpl;

public class FindTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IceRepository rep=new IceRepositoryImpl();
		IceEntity entity=rep.findByNameAndPrice("orange", 200);
		System.out.println(entity);

	}

}
