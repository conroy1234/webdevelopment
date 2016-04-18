package com.domgen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.domgen.dto.Product;

public class ProductDao implements IProductDAO {

	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	@Override
	public List<Product> fetchProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProduct(Product product) throws Exception {			
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();

	}

	@Override
	public void updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(Product product) throws Exception {
		// TODO Auto-generated method stub

	}

}
