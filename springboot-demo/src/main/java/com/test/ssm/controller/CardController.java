package com.test.ssm.controller;

import java.util.List;

<<<<<<< HEAD
import javax.validation.constraints.Pattern.Flag;

=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.ssm.pojo.Card;
import com.test.ssm.pojo.Order;
=======
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.ssm.pojo.Card;
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
import com.test.ssm.ret.Result;
import com.test.ssm.service.CardService;

@Controller
@CrossOrigin
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	//查询家教集合
<<<<<<< HEAD
	@RequestMapping(value = "/queryCard",method=RequestMethod.GET)
	@ResponseBody
	public Result queryCard(@RequestParam String course,@RequestParam int flag) {
		//分页拦截：设置分页 页码和每页记录条数
		//PageHelper.startPage(pageNum, 10);
		List<Card> list= cardService.queryCard(course);
=======
	@RequestMapping(value = "/queryCard",method=RequestMethod.POST)
	@ResponseBody
	public Result queryCard(@RequestBody Card card) {
		//分页拦截：设置分页 页码和每页记录条数
		//PageHelper.startPage(pageNum, 10);
		List<Card> list= cardService.queryCard(card);
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
		// 创建分页bean
		 /* PageInfo page = new PageInfo<>(list);
		  page.getTotal();//总记录数
		  page.getPages();//总页数
		  page.getPrePage();//前一页
		  page.getNextPage();//下一页
		  page.getPageNum();//当前页
		 */
<<<<<<< HEAD
		if (flag == 2) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getCourse().equals(course)) {
					continue;
				}
				else {
					list.remove(i);
					i--;
				}
			}
		}
=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
		if (list !=  null && list.size()>0) {
			return Result.success(200, list);
		}
		else {
			return Result.failMessage(400, "暂时还没有家教！");
		}		
	}
	
	
	//通过用户id查询已发布的家教
	@RequestMapping(value = "/selectCardByAccount",method=RequestMethod.POST)
	@ResponseBody
	public Result selectCardByAccount(@RequestBody Card card) {
		List<Card> list = cardService.selectCardByAcoount(card.getAccount());
		if (list !=  null && list.size() >0) {
			return Result.success(200, list);
		}
		else {
			return Result.failMessage(400, "不存已发布的家教信息");
		}
	}
	
	//发布家教
	@RequestMapping(value="/addCard",method=RequestMethod.POST)
	@ResponseBody
	public Result addCard(@RequestBody Card card) {
		return cardService.addCard(card);
	}
	
	
	//修改家教信息
	@RequestMapping(value="/updateCard",method=RequestMethod.POST)
	@ResponseBody
	public Result updateCard(@RequestBody Card card) {
		return cardService.updateCard(card);
	}
	
	//删除家教
	@RequestMapping(value="/deleteCard",method=RequestMethod.POST)
	@ResponseBody
	public Result deleteCard(@RequestBody Card card) {
		return cardService.deleteCard(card);
	}
<<<<<<< HEAD
	
	
	//接单   修改家教的信息状态，并且添加一条订单记录，status为1
	@RequestMapping(value="/updateCardAndOrder",method=RequestMethod.POST)
	@ResponseBody
	public Result updateCardAndOrder(@RequestBody Order order) {
		int i = cardService.updateCardAndOrder(order);
		if (i == 1) {
			return Result.seccuessMessage(200, "接单成功！");
		}
		return Result.failMessage(400, "接单失败！");
		
	}
=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
}

