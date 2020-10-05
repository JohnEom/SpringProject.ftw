package com.ftw.ptp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ftw.ptp.service.PtpService;
import com.ftw.ptp.vo.PtpVO;

import net.webjjang.util.PageObject;

@Controller
@RequestMapping("/ptp")
public class PtpController {

	@Autowired
	private PtpService service;
	
	private String MODULE_NAME = "ptp/";
	
	// 리스트
	@GetMapping("/list.do")
	public String list(PageObject pageObject, Model model) {
		model.addAttribute("list", service.list(pageObject));
		model.addAttribute("pageObject", pageObject);
		return MODULE_NAME + "list";
	}
	
	// 글보기
	@GetMapping("/view.do")
	public String view(Model model,PtpVO vo,int inc) {
		model.addAttribute("vo", service.view(vo.getNo(), inc));
		return MODULE_NAME + "view";
	}
	
	// 글쓰기 폼
	@GetMapping("/write.do")
	public String writeForm() {
		return MODULE_NAME + "write";
	}
	
	// 글쓰기 처리
	@PostMapping("/write.do")
	public String write(PtpVO vo) {
		service.write(vo);
		return "redirect:list.do";
	}
	
	// 글수정 폼
	@GetMapping("/update.do")
	public String updateForm(Model model,PtpVO vo) {
		model.addAttribute("vo", service.view(vo.getNo(), 0));
		return MODULE_NAME + "update";
	}
	
	// 글수정 처리 
	@PostMapping("/update.do")
	public String update(PtpVO vo) {
		service.update(vo);
		return "redirect:view.do?inc=0&no="+vo.getNo();
	}
	
	// 글삭제
	@PostMapping("/delete.do")
	public String delete(PtpVO vo) {
		service.delete(vo);
		return "redirect:list.do";
	}
	
	
}
