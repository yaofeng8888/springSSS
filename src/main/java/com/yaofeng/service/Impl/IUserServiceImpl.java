package com.yaofeng.service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaofeng.dao.IUserDao;
import com.yaofeng.pojo.po.User;
import com.yaofeng.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private IUserDao userDao;
	
	@Override
	public List<User> userlist() {
		List<User> userlist = null;
		
		try {
			userlist = userDao.userlist();
			
		} catch (RuntimeException e) {
			// TODO: handle exception
			logger.error(e.getMessage(),e);
			e.printStackTrace();
		}
		return userlist;
	}

}
