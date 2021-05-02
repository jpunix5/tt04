package com.test13.service;

import java.util.List;

import com.test13.entities.TestBoardEntity;

public interface TestBoardService {
	List<TestBoardEntity> boardlist();
	
	void boardcreate(TestBoardEntity board);
	
	void boarddelete(Integer idx);
	
	TestBoardEntity selectone(Integer idx);
	
	void boardupdate(TestBoardEntity board);
}
