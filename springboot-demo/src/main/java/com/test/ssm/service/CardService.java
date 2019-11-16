package com.test.ssm.service;

import java.util.List;

import com.test.ssm.pojo.Card;
<<<<<<< HEAD
import com.test.ssm.pojo.Order;
=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
import com.test.ssm.ret.Result;

public interface CardService {

	//查询一个单家教对象
	public Card selectCard(String cardid);
	public Result addCard(Card card);
	public Result updateCard(Card card);
	public Result deleteCard(Card card);
	//查询所有的家教
<<<<<<< HEAD
	public List<Card> queryCard(String course);
	//查询每个用户自己已发布的家教
	public List<Card> selectCardByAcoount(String account);
	
	//接单
	public int updateCardAndOrder(Order order) ;
=======
	public List<Card> queryCard(Card card);
	//查询每个用户自己已发布的家教
	public List<Card> selectCardByAcoount(String account);
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
}
