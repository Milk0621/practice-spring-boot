package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content", "admin/board/notice/list :: content");
		return "admin/inc/layout";
	}

	@GetMapping("detail")
	public String detail(Model model) {
		model.addAttribute("pageTitle", "공지사항");
		model.addAttribute("content", "admin/board/notice/detail :: content");
		return "admin/inc/layout";
	}
	
	@GetMapping("reg")
	public String reg(Model model) {
		model.addAttribute("pageTitle", "공지사항 등록");
		model.addAttribute("content", "admin/board/notice/reg :: content");
		return "admin/inc/layout";
	}
}
