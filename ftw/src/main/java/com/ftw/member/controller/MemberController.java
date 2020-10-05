package com.ftw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	private final String MODULE_NAME = "member/";  
	
	@GetMapping("/list.do")
	public String list() {
		
		return MODULE_NAME + "list";
	}
}
