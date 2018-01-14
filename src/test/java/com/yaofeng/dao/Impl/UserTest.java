package com.yaofeng.dao.Impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yaofeng.dao.IUser;
import com.yaofeng.pojo.po.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class UserTest {

	@Autowired
	private IUser user;
	@Test
	public void testUser() {
		List<User> list = user.userlist();
		System.out.println(list.size());
	}
}
