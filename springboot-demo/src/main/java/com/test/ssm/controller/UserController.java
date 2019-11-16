package com.test.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.ssm.mapper.UserMapper;
=======
import org.springframework.web.bind.annotation.ResponseBody;

>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
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
	
<<<<<<< HEAD
	//查询一个用户
=======
	//查询用户
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
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
	
<<<<<<< HEAD
	
	//用户审核查询
	
		@RequestMapping(value = "/selectUserList",method=RequestMethod.POST)
		@ResponseBody
		public Result selectUserList(@RequestBody User user) {
			return userService.selectUserList(user.getPermission());
			}
		
		//用户审核修改
		
		@RequestMapping(value = "/updateUserPer",method=RequestMethod.GET)
		@ResponseBody
		public Result update(@RequestParam String account,@RequestParam int flag) {
			System.out.print(account);
				return userService.update(account,flag);
			}
}
=======
}
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
