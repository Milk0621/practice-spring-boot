package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDAO {
	
	List<NoticeView> getList(int offset, int size, String field, String query);
	
	Notice get(int id);
	
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);

}
