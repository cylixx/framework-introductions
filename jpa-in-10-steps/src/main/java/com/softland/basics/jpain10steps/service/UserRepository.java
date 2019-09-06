package com.softland.basics.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softland.basics.jpain10steps.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
