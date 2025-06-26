package com.newlecture.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@GetMapping("list")
	public String list(Model model) {

		List<NoticeView> list = service.getList();
		
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content", "admin/board/notice/list :: content");
		model.addAttribute("list", list);
		
		return "admin/inc/layout";
	}

	@GetMapping("detail")
	public String detail(Model model) {
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content", "admin/board/notice/detail :: content");
		
		Notice notice = service.get(1);
				
		return "admin/inc/layout";
	}
	
	@GetMapping("reg")
	public String reg(Model model) {
		model.addAttribute("pageTitle", "공지사항 등록");
		model.addAttribute("content", "admin/board/notice/reg :: content");
		return "admin/inc/layout";
	}
}
