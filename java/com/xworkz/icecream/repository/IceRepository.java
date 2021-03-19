package com.xworkz.icecream.repository;

import java.util.List;

import com.xworkz.icecream.entity.IceEntity;

public interface IceRepository {

	
	public void persist(IceEntity entity);
	public void deleteByName(String name);	
	public void deleteById(int id);	
	public void updatePriceByName(String name,double price);
	public List<IceEntity> getAll();
	public IceEntity findByNameAndPrice(String name,double price);
	public IceEntity getMaxPrice();
	public IceEntity getMinPrice();
	public double  getBySumPrice();
	public double getPriceByName(String name);
	public List<Object[]> getNameAndFlavourByPrice(double price);
	
}
