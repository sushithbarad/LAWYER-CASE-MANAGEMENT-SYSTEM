package org.jsp.manytomany_ui.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomany_ui.dto.Lawyer;

public class LawyerCasesDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	public static void save(Lawyer lawyer) {
        et.begin();
        em.persist(lawyer);
        et.commit();
    }
	
}