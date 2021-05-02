package com.test13.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.test13.entities.TableColumnEntity;
import com.test13.entities.TestUsersEntity;
import com.test13.service.TableColumnService;
import com.test13.service.TestUsersService;

//@RestController
public class TestAjaxController {
	@Autowired
	private TestUsersService testusersservice;
	@Autowired
	private TableColumnService tablecolumnservice;

	/*
	 * ajax 처리를 위한 controller
	 * @ResponseBody String 형태의 단순 문자 반환
	 * ModelAndView json에 원하는 데이터 타입을 넣어 반환 하기 위한 객체
	 * view로 부터 값을 받을 때는 (@ReqeustBody 타입 변수명) 을 이용 한다
	 */

//	@RequestMapping(value="/ajaxwrite.do", method = RequestMethod.POST, produces = "application/json")
//	public void ajaxwrite(@RequestBody TestUsersEntity user) {
//		testusersservice.usercreate(user);
//	}
	
	
}
