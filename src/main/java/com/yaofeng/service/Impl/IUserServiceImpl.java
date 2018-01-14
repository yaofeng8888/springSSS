package com.yaofeng.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaofeng.dao.IUserDao;
import com.yaofeng.pojo.po.User;
import com.yaofeng.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {
	
	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public List<User> userlist() {
		List<User> userlist = null;
		try {
			userlist = userDao.userlist();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return userlist;
	}

}
