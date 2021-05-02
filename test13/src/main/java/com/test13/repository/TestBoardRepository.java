package com.test13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test13.entities.TestBoardEntity;

public interface TestBoardRepository extends JpaRepository<TestBoardEntity, Integer>{

}
