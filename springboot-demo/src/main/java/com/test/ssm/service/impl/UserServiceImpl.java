package com.test.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.test.ssm.mapper.UserMapper;
import com.test.ssm.pojo.User;
import com.test.ssm.pojo.UserExample;
import com.test.ssm.ret.Result;
import com.test.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public Result login(User user) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		
		criteria.andAccountEqualTo(user.getAccount());
		criteria.andPasswordEqualTo(user.getPassword());
		
		List<User> users = userMapper.selectByExample(userExample);
		if (users !=null && users.size()>0) {
			return Result.success(200, users.get(0));
			}
		else {
			return Result.failMessage(400, "账号或密码错误");
		}
	}


	@Override
	public Result register( User user) {
		user.setPermission(1);
		User auser = selectUser(user.getAccount());
		if (auser != null) {
			return Result.failMessage(400, "该用户已存在不能进行注册！");
		}
		else {
			int i = userMapper.insert(user);
			if (i==1) {
				return Result.seccuessMessage(200, "注册成功!");
			}
			else {
				return Result.failMessage(400, "注册失败!");
			}
		}
	}

	
	@Override
	public Result updateUser(User user) {
		String account =  user.getAccount();
		User auser = selectUser(user.getAccount());
		if (auser != null) {
			int i = userMapper.updateByPrimaryKey(user);
			if (i ==1) {
				auser = selectUser(account);
				return Result.seccuessMessage(200, "更新成功！");
			}
			else {
				return Result.failMessage(400, "更新失败!");
			}

				}
		else 
			return Result.failMessage(400, "不存在该用户！");
	}

	
	@Override
	public User selectUser(String account) {
		return  userMapper.selectByPrimaryKey(account);
	}
	
}
