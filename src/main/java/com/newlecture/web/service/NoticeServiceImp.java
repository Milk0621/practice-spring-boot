package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDAO;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImp implements NoticeService{

	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<NoticeView> getViewList() {
		return getViewList(1, "title", "");
	}

	@Override
	public List<NoticeView> getViewList(String field, String query) {
		return getViewList(1, field, query);
	}

	@Override
	public List<NoticeView> getViewList(int page, String field, String query) {
		
		int size = 10;
		int offset = 0 + (page-1) * size;
		
		List<NoticeView> list = noticeDAO.getViewList(offset, size, field, query);
		
		return list;
	}
	
	@Override
	public int getCount() {
		return getCount("title", "");
	}

	@Override
	public int getCount(String field, String query) {
		return noticeDAO.getCount(field, query);
	}
	
	@Override
	public NoticeView getView(int id) {
		NoticeView notice = noticeDAO.getView(id);
		return notice;
	}

	@Override
	public Notice getNext(int id) {
		return noticeDAO.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		return noticeDAO.getPrev(id);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		return noticeDAO.updatePubAll(pubIds, closeIds);
	}

	@Override
	public int deleteAll(int[] ids) {
		return noticeDAO.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		return noticeDAO.update(notice);
	}

	@Override
	public int delete(int id) {
		return noticeDAO.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		return noticeDAO.insert(notice);
	}

}
