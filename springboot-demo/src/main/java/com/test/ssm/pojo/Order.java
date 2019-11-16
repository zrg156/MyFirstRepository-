package com.test.ssm.pojo;
<<<<<<< HEAD

/**
 * @author zhu
 *
=======
/*
 * 订单类
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
 */
public class Order {
    private String id;

<<<<<<< HEAD
=======
    private String publish;

>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
    private String cardid;

    private String account;

    private String name;

    private String title;

    private Integer status;

<<<<<<< HEAD
    private User user;
    
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
=======
    public String getId() {
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

<<<<<<< HEAD
=======
    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
    public String getCardid() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}