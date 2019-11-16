package com.test.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.ssm.mapper.CardMapper;
<<<<<<< HEAD
import com.test.ssm.mapper.CardOrderMapper;
import com.test.ssm.mapper.OrderMapper;
import com.test.ssm.mapper.UserMapper;
import com.test.ssm.pojo.Card;
import com.test.ssm.pojo.CardExample;
import com.test.ssm.pojo.Order;
import com.test.ssm.pojo.User;
=======
import com.test.ssm.pojo.Card;
import com.test.ssm.pojo.CardExample;
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
import com.test.ssm.ret.Result;
import com.test.ssm.service.CardService;
import com.test.ssm.util.MyUtil;
@Service
public class CardServiceImpl implements CardService {
    @Autowired
	private CardMapper cardMapper;
<<<<<<< HEAD
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private UserMapper userMapper;
=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
	
	
	@Override
	public Card selectCard(String cardid) {
		Card card = cardMapper.selectByPrimaryKey(cardid);
		if (card != null) {
			return card;
		}
		return null;
	}

	@Override
	public Result addCard(Card card) {
		card.setCardid(MyUtil.getStringID());
		Card acard = selectCard(card.getCardid());
		if (acard != null) {
			return Result.failMessage(400, "该家教id已存在不能进行发布！");
		}
		else {
			int i = cardMapper.insert(card);
			if (i==1) {
				return Result.seccuessMessage(200, "发布成功!");
			}
			else {
				return Result.failMessage(400, "发布失败!");
			}
		}
	}

	@Override
	public Result updateCard(Card card) {
		Card acard = selectCard(card.getCardid());
<<<<<<< HEAD
		acard.setStatus(card.getStatus());
		if (acard !=null) {
			int i =cardMapper.updateByPrimaryKey(acard);
=======
		if (acard !=null) {
			int i =cardMapper.updateByPrimaryKey(card);
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
			if (i == 1) {
				return Result.seccuessMessage(200, "更新成功！");
			}
			else {
				return Result.failMessage(400, "更新失败！");
			}
		}
		return Result.failMessage(400, "更新失败！");
	}

	@Override
	public Result deleteCard(Card card) {
		Card acard = selectCard(card.getCardid());
		if (acard !=null) {
			int i =cardMapper.deleteByPrimaryKey(card.getCardid());
			if (i == 1) {
				return Result.seccuessMessage(200, "删除成功！");
			}
			else {
				return Result.failMessage(400, "删除失败！");
			}
		}
		return Result.failMessage(400, "删除失败！");
	}

	@Override
	//根据级别、年级、科目进行筛选查询
<<<<<<< HEAD
	public List<Card> queryCard(String course) {
		CardExample example = new CardExample();
		CardExample.Criteria criteria = new CardExample().createCriteria();
		/*
=======
	public List<Card> queryCard(Card card) {
		CardExample example = new CardExample();
		CardExample.Criteria criteria = new CardExample().createCriteria();
		
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
		if (card != null) {
			//1.根据年级进行筛选
			if (card.getGrade() != null && !"".equals(card.getLevel())) {
				criteria.andLevelEqualTo(card.getLevel());
			}
			//2.根据年级进行筛选
			if (card.getGrade() !=  null && !"".equals(card.getGrade())) {
				criteria.andGradeEqualTo(card.getGrade());
			}
			//3.根据科目进行筛选
			if (card.getCourse() != null && !"".equals(card.getCourse())) {
				criteria.andCourseEqualTo(card.getCourse());
			}
		}
<<<<<<< HEAD
		*/
=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
		int i = 0;
		//只查询没有被接单的
		criteria.andStatusEqualTo(i);
		List<Card> list = cardMapper.selectByExample(example);
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getStatus() ==1 || list.get(j).getStatus() ==2) {
				list.remove(j);
				j--;
<<<<<<< HEAD
				}
			}
		
		return list;
	}

	
=======
			}
		}
		return list;
	}

>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
	@Override
	public List<Card> selectCardByAcoount(String account) {
		CardExample example =  new CardExample();
		CardExample.Criteria criteria = example.createCriteria();
		
		criteria.andAccountEqualTo(account);
		List<Card> list = cardMapper.selectByExample(example);
		return list;
	}

<<<<<<< HEAD
	
	//接单
	@Override
	public int updateCardAndOrder(Order order) {
		Card acard = selectCard(order.getCardid());
		acard.setStatus(1);
		User user = userMapper.selectByPrimaryKey(order.getAccount());
		if (acard !=null) {
			int i =cardMapper.updateByPrimaryKey(acard);
			if (i==1) {
				order.setId(MyUtil.getStringID());
				order.setName(user.getName());
				order.setStatus(1);
				order.setTitle(acard.getTitle());
				int j = 0;
			    j =orderMapper.insert(order);
				return j;
				}
			}
		return 0;
		}
	}
=======
}
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
