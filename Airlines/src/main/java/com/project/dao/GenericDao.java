package com.project.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;





public class GenericDao {
		
public void save(Object   obj) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Airlines");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	
	//merge is 2 in 1 method
	//can be used for insert as well as update both
	
	em.merge(obj);
	tx.commit();
	emf.close();
}

}	
	
	


