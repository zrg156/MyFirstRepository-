package com.test.ssm.service;



import com.test.ssm.pojo.User;
import com.test.ssm.ret.Result;

public interface UserService {

	public Result login(User user) ;
	public Result register(User user);
	public Result updateUser(User user);
	public User selectUser(String account);
}
