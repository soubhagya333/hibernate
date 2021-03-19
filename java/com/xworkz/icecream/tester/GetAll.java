package com.xworkz.icecream.tester;

import java.util.List;

import com.xworkz.icecream.entity.IceEntity;
import com.xworkz.icecream.repository.IceRepository;
import com.xworkz.icecream.repository.IceRepositoryImpl;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<IceEntity>list	=new IceRepositoryImpl().getAll();
	
		
		System.out.println(list);
	}

}
