package com.test.ssm.service;



import com.test.ssm.pojo.User;
import com.test.ssm.ret.Result;

public interface UserService {
//登录、注册、更新一个用户、查询一个用户、用户审核
	public Result login(User user) ;
	public Result register(User user);
	public Result updateUser(User user);
	public User selectUser(String account);
	public Result selectUserList(int permission);
	public Result update(String account,int flag);
}
