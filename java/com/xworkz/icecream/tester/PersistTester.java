package com.xworkz.icecream.tester;

import com.xworkz.icecream.entity.IceEntity;
import com.xworkz.icecream.entity.IceEntity.Color;
import com.xworkz.icecream.entity.IceEntity.Flavour;
import com.xworkz.icecream.repository.IceRepository;
import com.xworkz.icecream.repository.IceRepositoryImpl;

public class PersistTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IceEntity entity=new IceEntity("gadbad", Flavour.ORANGE, "amul", 300, Color.BROWN);
		
		IceEntity entity1=new IceEntity("honymoon", Flavour.MANGO, "xyz", 300, Color.BLUE);
		
		IceEntity entity2=new IceEntity("orange", Flavour.ORANGE, "orange", 300, Color.ORANGE);
		
		IceRepository repository=new IceRepositoryImpl();
repository.persist(entity);
//		repository.persist(entity1);
//		repository.persist(entity2);
//		
	System.out.println(entity);
//		System.out.println(entity1);
//		System.out.println(entity2);
//		
    
	}

}
