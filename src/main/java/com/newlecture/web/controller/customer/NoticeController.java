package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

//@RestController
@Controller //view 페이지(jsp)를 넘겨줄때에는 Controller를 써야함
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@GetMapping("list")
	public String list(Model model) {
		
		List<Notice> list = service.getList();
		
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content","customer/notice/list :: content");
		model.addAttribute("list", list);
		
		return "customer/inc/layout";
	}
	
	@RequestMapping("detail")
	public String detail(Model model) {
		
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content", "customer/notice/detail :: content");
		
		return "customer/inc/layout";
	}
}
