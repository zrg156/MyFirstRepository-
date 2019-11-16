package com.test.ssm.service;



import com.test.ssm.pojo.User;
import com.test.ssm.ret.Result;

public interface UserService {
<<<<<<< HEAD
//登录、注册、更新一个用户、查询一个用户、用户审核
=======

>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
	public Result login(User user) ;
	public Result register(User user);
	public Result updateUser(User user);
	public User selectUser(String account);
<<<<<<< HEAD
	public Result selectUserList(int permission);
	public Result update(String account,int flag);
=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
}
