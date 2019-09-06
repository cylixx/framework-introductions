package com.softland.basics.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.softland.basics.jpain10steps.entity.User;
import com.softland.basics.jpain10steps.service.UserDAOService;
import com.softland.basics.jpain10steps.service.UserRepository;

//CommandLineRunner - 
//Interface used to indicate that a bean should run when it is contained within a SpringApplication
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Marco", "Admin");
		//New user is created: User [id=1, name=Jack, role=Admin]
		userRepository.save(user);
		logger.info("===== New user is created: {}", user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		logger.info("===== User is retrived: {}", userWithIdOne);
		
		List<User> users = userRepository.findAll();
		logger.info("===== All Users: {}", users);
		
	}

}
