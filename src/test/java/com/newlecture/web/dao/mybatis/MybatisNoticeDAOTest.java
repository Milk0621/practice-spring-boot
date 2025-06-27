package com.newlecture.web.dao.mybatis;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.dao.NoticeDAO;
import com.newlecture.web.entity.NoticeView;

@SpringBootTest
class MybatisNoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	void test() {
		List<NoticeView> list = noticeDAO.getViewList(0, 1, null, null, false);
		System.out.println(list.get(0));
	}

}
