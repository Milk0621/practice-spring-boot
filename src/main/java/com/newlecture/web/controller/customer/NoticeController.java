package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

//@RestController
@Controller //view 페이지(jsp)를 넘겨줄때에는 Controller를 써야함
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@GetMapping("list")
	public String list(Model model) {
		
		int page = 1;
		String field = "title";
		String query = "";
		boolean pub = true;
		
		List<NoticeView> list = service.getViewList(page, field, query, pub);
		
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content","customer/notice/list :: content");
		model.addAttribute("list", list);
		
		return "customer/inc/layout";
	}
	
	@GetMapping("detail")
	public String detail(Model model, @RequestParam("id") int id) {
		
		NoticeView notice = service.getView(id);
		Notice prev = service.getPrev(id);
		Notice next = service.getNext(id);
		
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content", "customer/notice/detail :: content");
		
		model.addAttribute("detail", notice);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		
		return "customer/inc/layout";
	}
}
