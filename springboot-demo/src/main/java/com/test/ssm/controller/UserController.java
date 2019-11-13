package com.test.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.ssm.pojo.User;
import com.test.ssm.ret.Result;
import com.test.ssm.service.UserService;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	//登录
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody 
	public Result login(@RequestBody User user) {
		return userService.login(user);
	}
	
	//注册
	@RequestMapping(value = "/register",method=RequestMethod.POST)
	@ResponseBody
	public Result register(@RequestBody  User user) {
			return userService.register(user);
	}
	
	
	//修改用户信息
	@RequestMapping(value = "/updateUser",method=RequestMethod.POST)
	@ResponseBody
	public Result updateUser(@RequestBody User user) {
			return userService.updateUser(user);
	}
	
	//查询用户
	@RequestMapping(value = "/selectUser",method=RequestMethod.POST)
	@ResponseBody
	public Result selectUser(@RequestBody User user) {
			User auser = userService.selectUser(user.getAccount());
			if (auser != null) {
				return Result.success(200, auser);
			}
			else {
				return Result.failMessage(400, "查询失败！");
			}
	}
	
}
