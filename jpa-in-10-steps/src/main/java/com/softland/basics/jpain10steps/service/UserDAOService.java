package com.softland.basics.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.softland.basics.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDAOService {

	/*
	 
	  User jack = new User("Jack", "Admin");
	  User jill = new User("Jill", "Admin");
	  
	  entityManager.persist(jack);
	  
	  //only jack is in the persistence context
	  jack.setRole("User");
	  jill.setRole("User");
	 
	 */
	
	@PersistenceContext   // EntityManager its associated persistence context.
	private EntityManager entityManager; 
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
