package com.yaofeng.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaofeng.pojo.po.User;
import com.yaofeng.service.Impl.IUserServiceImpl;

@Controller
public class UserAction {

	@Autowired
	private IUserServiceImpl userService;
	
	@RequestMapping(value="/user" ,method=RequestMethod.GET)
	public String listuser(Model model) {
		List<User> list = userService.userlist();
		model.addAttribute("list",list);
		return"list";
	}
	
}
