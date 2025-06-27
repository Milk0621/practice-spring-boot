package com.newlecture.web.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.newlecture.web.entity.NoticeView;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest //MyBatis의 매퍼를 직접 사용할때 사용, @SpringBootTest 사용해도 무방
class NoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	void test() {
		List<NoticeView> list = noticeDAO.getViewList(0, 1, null, null, false);
		
		System.out.println(list.get(0));
	}

}
