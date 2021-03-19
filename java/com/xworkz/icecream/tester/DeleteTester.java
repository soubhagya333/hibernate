package com.xworkz.icecream.tester;

import com.xworkz.icecream.repository.IceRepository;
import com.xworkz.icecream.repository.IceRepositoryImpl;

public class DeleteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceRepository repository=new IceRepositoryImpl();
		repository.deleteByName("honymoon");
		System.out.println(repository);
		

		repository.deleteById(6);
		repository.deleteById(13);
		
	}

}
