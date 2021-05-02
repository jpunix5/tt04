package com.test13.service;

import java.util.List;

import com.test13.entities.TestUsersEntity;

public interface TestUsersService {
	List<TestUsersEntity> userlist();
	
	void usercreate(TestUsersEntity user);
	
	void userdelete(Integer idx);
	
	TestUsersEntity selectone(Integer idx);
	
	void userupdate(TestUsersEntity user);
}
