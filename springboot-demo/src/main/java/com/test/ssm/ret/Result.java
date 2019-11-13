package com.test.ssm.ret;

import com.alibaba.fastjson.JSON;
/*
 * 用json封装一个泛型返回对象
 */
public class Result<T> {

	//状态码、提示信息、数据（对象）
	private int code;
	private String msg;
	private T data;
	
	
	public int getCode() {
		return code;
	}
	public Result setCode(int code) {
		this.code = code;
		return this;
	}
	public String getMsg() {
		return msg;
	}
	public Result setMsg(String msg) {
		this.msg = msg;
		return this;
	}
	public T getData() {
		return data;
	}
	public Result setData(T data) {
		this.data = data;
		return this;
	}
	
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

	public static <T> Result<T> fail(Integer code,T data){
		Result<T> retResult = new Result<T>();
		retResult.setCode(code);
		retResult.setData(data);
	    return retResult;	
	}
	
	public static <T> Result<T> failMessage (Integer code, String msg){
		Result<T>  retResult = new Result<T>();
		retResult.setCode(code);
		retResult.setMsg(msg);
		return retResult;
	}
	
	public static<T> Result<T> seccuessMessage(Integer code,String msg) {
	
		Result<T> retResult = new Result<T>();
		retResult.setCode(code);
		retResult.setMsg(msg);
		return retResult;
	}
	
	public static<T> Result<T> success(Integer code,T data){
		Result<T> retResult  = new Result<T>();
	    retResult.setCode(code);
	    retResult.setData(data);
	    return retResult;
	}







}








