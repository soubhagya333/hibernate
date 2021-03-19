package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.icecream.entity.IceEntity;
import com.xworkz.icecream.util.EmUtil;

public class IceRepositoryImpl implements IceRepository {

	private EntityManagerFactory factory = EmUtil.getFactory();

	public IceRepositoryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void persist(IceEntity entity) {
		System.out.println("invoked persist ");
		// Session factory===entityManagerFactory
		// session ===entityManager

		// EntityManagerFactory factory =
		// Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();

		// EntityTransaction tn = session.getTransaction();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		System.out.println("commited");
		session.close();

	}

	@Override
	public void deleteByName(String name) {
		System.out.println("invoked delete");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.createNamedQuery("deleteByName").setParameter("nm", name).executeUpdate();
		session.getTransaction().commit();
		System.out.println("commited");
		session.close();

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		System.out.println("invoked delete");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.createNamedQuery("deleteById").setParameter("id", id).executeUpdate();
		session.getTransaction().commit();
		System.out.println("commited");
		session.close();

	}

	@Override
	public void updatePriceByName(String name, double price) {
		// TODO Auto-generated method stub

		System.out.println("invoked update");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.createNamedQuery("updatePriceByName").setParameter("nm", name).setParameter("pr", price)
				.executeUpdate();
		session.getTransaction().commit();
		System.out.println("commited for update");
		session.close();

	}

	@Override
	public List<IceEntity> getAll() {
		System.out.println("invoked update");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("getAll");
		List<IceEntity> hql = query.getResultList();
		session.getTransaction();

		return hql;

	}

	@Override
	public IceEntity findByNameAndPrice(String name, double price) {
		System.out.println("invoked update");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("findByNameAndPrice").setParameter("nm", name).setParameter("pr", price);
		IceEntity hql = (IceEntity) query.getSingleResult();
		session.getTransaction().commit();
		return hql;

	}

	@Override
	public IceEntity getMaxPrice() {
		System.out.println("invoked max price");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("getMaxPrice");
		IceEntity hql = (IceEntity) query.getSingleResult();
		session.getTransaction().commit();
		return hql;

	}

	@Override
	public IceEntity getMinPrice() {
		// TODO Auto-generated method stub
		
		System.out.println("invoked min price");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("getMinPrice");
		IceEntity hql = (IceEntity) query.getSingleResult();
		session.getTransaction().commit();
		return hql;
		
	}

	@Override
	public double getBySumPrice() {
		System.out.println("invoked sum price");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("getBySumPrice");
		double hql = (double) query.getSingleResult();
		session.getTransaction().commit();
		return hql;

		
	}

	@Override
	public double getPriceByName(String name) {
		System.out.println("invoked price by name");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("getPriceByName").setParameter("nm", name);
		double hql = (double) query.getSingleResult();
		
		session.close();
		return hql;
	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		System.out.println("invoked getNameAndFlavourByPrice");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("getNameAndFlavourByPrice").setParameter("pr", price);
		List<Object[]> hql = query.getResultList();
		session.getTransaction();

		return hql;
	}

}
