package com.test.ssm.util;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MyUtil {
	/**
	 * 根据当前时间生成字符串id
	 */
	public static String getStringID(){
		String id=null;
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS"); 
		id=sdf.format(date);
		return id;
	}
	/**
	 * 生成100000000内的随机数字符串
	 */
	public static String getRandom() {
		int n = (int)(Math.random()*100000000);
		return n + "";
	}
	/**
	 * 获取文件扩展名
	 */
	public static String getFileExtendsName(String filenname) {
		int lastPointIndex = filenname.lastIndexOf(".");
		String extendsName = filenname.substring(lastPointIndex);
		return extendsName;
	}
	/**
	 * （汉字）字符串转换为UTF-8编码
	 */
	public static String toUTF8String(String str){
		StringBuffer sb = new StringBuffer();
		int len = str.length();
		for(int i = 0; i < len; i++){
			//遍历字符串
			char c = str.charAt(i);
			//Unicode 0-255 保持不变
			if(c >= 0 && c <= 255){
				sb.append(c);
			}else{//转换其它的字符
				byte b[];
				try {
					b = Character.toString(c).getBytes("UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
					b = null;
				}
				//转换为无符号integer
				for(int j = 0; j < b.length; j ++){
					int k = b[j];
					if(k < 0){
						k &= 255;
					}
					//返回整数参数的字符串表示形式 作为十六进制（base16）中的无符号整数
					//该值以十六进制（base16）转换为ASCII数字的字符串
					sb.append("%" + Integer.toHexString(k).toUpperCase());
				}
			}
		}
		return sb.toString();
	}

}
