package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

@Table(name="icecream")
@NamedQueries({
	@NamedQuery(name="deleteByName", query="delete  from  IceEntity ice where ice.name=:nm"),
	@NamedQuery(name="deleteById", query="delete  from IceEntity ice where ice.id=:id"),
	@NamedQuery(name="updatePriceByName", query="update IceEntity ice set ice.price=:pr where ice.name=:nm"),
	@NamedQuery(name="getAll", query="select ice from IceEntity ice"),
	@NamedQuery(name="findByNameAndPrice",query="select ice from IceEntity ice where ice.name=:nm and ice.price=:pr"),
	@NamedQuery(name="getMaxPrice" , query="select ice from IceEntity ice where ice.price=(select max(ice.price) from IceEntity ice)"),
	@NamedQuery(name="getMinPrice" , query="select ice from IceEntity ice where ice.price=(select min(ice.price) from IceEntity ice)"),
	@NamedQuery(name="getBySumPrice" , query="select sum(price) from IceEntity"),
	@NamedQuery(name="getPriceByName" , query="select ice.price from IceEntity ice where ice.name=:nm"),
	@NamedQuery(name="getNameAndFlavourByPrice" , query="select  ice.name, ice.flavour from IceEntity ice where ice.price=:pr")
})


public class IceEntity {
	
	@Id
	@GenericGenerator(name="auto" ,strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="FLAVOUR")
	private Flavour flavour;
	@Column(name="COMPANY")
	private String company;
	@Column(name="PRICE")
	private double price;
	@Column(name="COLOR")
	private Color color;
	
	public enum Color{
		WHITE,ORANGE,CREAM,PINK,BLUE,BROWN
	}
	public enum Flavour{
		ORANGE,CHOCO,MANGO,KULFI
	}
	/**
	 * @param name
	 * @param flavour
	 * @param company
	 * @param price
	 * @param color
	 */
	public IceEntity(String name, Flavour flavour, String company, double price, Color color) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.company = company;
		this.price = price;
		this.color = color;
	}
	

}
