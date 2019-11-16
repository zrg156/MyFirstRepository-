package com.test.ssm.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.ssm.mapper.OrderMapper;
import com.test.ssm.mapper.UserMapper;
import com.test.ssm.pojo.Card;
import com.test.ssm.pojo.Order;
import com.test.ssm.pojo.User;
import com.test.ssm.ret.Result;
import com.test.ssm.service.CardOrderService;
import com.test.ssm.service.CardService;
import com.test.ssm.service.UserService;
import com.test.ssm.util.MyUtil;
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728

@Controller
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

<<<<<<< HEAD
	@Autowired
	CardOrderService cardOrderService;
	@Autowired
	CardService cardService;
	@Autowired
	UserService userService;
	@Autowired
	OrderMapper orderMappper;
	
	//查詢已发布的订单
		@RequestMapping(value="/selectFromId",method=RequestMethod.POST)
		@ResponseBody 
		public Result selectFromId(@RequestBody User user) {
			List<Card> card =cardOrderService.findCardListFromId(user.getAccount());
			if (card !=null) {
				return Result.success(200,card);
			}
			else {
				return Result.failMessage(400, "不存在");
			}
		}
		
		//查詢已接的订单
				@RequestMapping(value="/selectById",method=RequestMethod.POST)
				@ResponseBody 
				public Result selectById(@RequestBody User user) {
					List<Card> card  =cardOrderService.findCardListById(user.getAccount());
					if (card !=null) {
						return Result.success(200,card);
					}
					else {
						return Result.failMessage(400, "不存在");
					}
				}
				
				
				//查詢已接并完成的订单
				@RequestMapping(value="/selectFinshOrder",method=RequestMethod.POST)
				@ResponseBody 
				public Result selectFinshOrder(@RequestBody User user) {
					List<Card> card  =cardOrderService.findCardListFinsh(user.getAccount());
					for (int i = 0; i < card.size(); i++) {
						System.out.print(card.get(i).getCardid()+"***");
					}
					if (card !=null) {
						return Result.success(200,card);
					}
					else {
						return Result.failMessage(400, "不存在");
					}
				}
				
		//更新  先是更新订单的状态，再改家教的状态
				@RequestMapping(value = "/updateOrder",method=RequestMethod.POST)
				@ResponseBody
				public Result updateOrder(@RequestBody Order order) {
					int i = cardOrderService.updateOrder(order);
					if (i == 1) {
						return Result.seccuessMessage(200, "更新成功！");
					}
					return Result.failMessage(400, "更新失败！");
				}
		
				//刪除  先是删除订单，再改家教的状态为2
				@RequestMapping(value = "/deleteOrder",method=RequestMethod.POST)
				@ResponseBody
				public Result deleteOrder(@RequestBody Order order) {
					Order aOrder = orderMappper.selectByPrimaryKey(order.getId()); 
					String cardId =aOrder.getCardid();
					Card card = cardService.selectCard(cardId);
					card.setStatus(1);
					int i = cardOrderService.deleteOrder(aOrder.getId());
					if (i == 1) {
						Result result = cardService.updateCard(card);
						if (result.getCode()==200) {
							return Result.seccuessMessage(200, "删除成功！");
						}
					}
					return Result.failMessage(400, "删除失败！");
				}
		
				
				//添加
				@RequestMapping(value = "/insertOrder",method=RequestMethod.POST)
				@ResponseBody
				public Result insertOrder(@RequestBody Order order) {
					User user = userService.selectUser(order.getAccount());
					order.setId(MyUtil.getStringID());
					order.setName(user.getName());
					order.setStatus(1);
					int i = cardOrderService.addOrder(order);
					if (i ==1) {
						return Result.seccuessMessage(200, "成功");
					}
					else {
						return Result.failMessage(400, "失败");
						}
				}
			}
=======
}
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
