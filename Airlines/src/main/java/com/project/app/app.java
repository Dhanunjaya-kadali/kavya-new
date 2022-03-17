package com.project.app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.dao.GenericDao;
import com.project.entity.User;

public class app {

	public static void main(String[] args) {
		
EntityManagerFactory emf= Persistence.createEntityManagerFactory("Airlines");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		GenericDao dao  = new GenericDao();
		
		User u = new User();
		u.setF_name("kavya");
		u.setL_name("ramesh");
		//u.setUser_age(22);
		u.setUser_gender("F");
		u.setUser_email("kavya@gmail");
		u.setUser_address("Nagercoil");
		u.setUser_pass("123kavya");
		dao.save(u);
       
		em.persist(u);
		tx.commit();
		emf.close();

	}

}
