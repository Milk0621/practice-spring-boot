package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDAO;
import com.newlecture.web.entity.Notice;

@Service
public class NoticeServiceImp implements NoticeService{

	@Autowired
	private NoticeDAO noticeDao;
	
	@Override
	public List<Notice> getList() {
		
		List<Notice> list = noticeDao.getList();
		
		return list;
	}

	@Override
	public Notice get(int id) {
		
		Notice notice = noticeDao.get(id);
		
		return null;
	}

}
