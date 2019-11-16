package com.test.ssm.pojo;
<<<<<<< HEAD

import java.util.List;

public class Card {
    private String cardid;
=======
/*
 * 家教类
 */
public class Card {
    //status  0是发布的，1是接单的，2是已完成的
	private String cardid;
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728

    private String account;

    private String title;

    private String grade;

    private String level;

    private String course;

    private String demand;

    private Double money;

    private String address;

    private String time;

    private Integer status;

<<<<<<< HEAD
    private List<Order> order;
    
    
    
    public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public String getCardid() {
=======
    public String getCardid() {
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand == null ? null : demand.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}