package com.softland.basics.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.softland.basics.jpain10steps.entity.User;
import com.softland.basics.jpain10steps.service.UserDAOService;

//CommandLineRunner - 
//Interface used to indicate that a bean should run when it is contained within a SpringApplication
@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		//New user is created: User [id=1, name=Jack, role=Admin]
		long insert = userDaoService.insert(user);
		logger.info("===== New user is created: {}", user);
	}

}
