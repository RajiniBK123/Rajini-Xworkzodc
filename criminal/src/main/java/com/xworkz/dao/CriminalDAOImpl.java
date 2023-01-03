package com.xworkz.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.CriminalDTO;
@Repository
public class CriminalDAOImpl implements CriminalDAO{

	@Autowired
	private EntityManagerFactory factory;
	EntityManager manager;

	@Override
	public boolean save(CriminalDTO dto) {
		System.out.println("calling save method ");
		EntityManager createEntityManager = factory.createEntityManager();

		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(dto);
			transaction.commit();

		} catch (PersistenceException e) {
			System.out.println("exceptinon in save dao" + e.getMessage());
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return true;
	}

	@Override
	public List<CriminalDTO> findAll() {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<CriminalDTO> resultList = query.getResultList();
			return resultList;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return findAll();
	
		
	}

}		


	

