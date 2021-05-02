package com.test13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test13.entities.TestUsersEntity;

public interface TestUsersRepository extends JpaRepository<TestUsersEntity, Integer>{

}
