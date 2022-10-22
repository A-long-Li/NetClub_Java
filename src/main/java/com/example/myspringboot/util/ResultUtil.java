package com.example.myspringboot.util;



import com.example.myspringboot.vo.ResponseVo;

/**
 * @version V1.0
 * @date 2018年7月11日
 * @author superzheng
 */
public class ResultUtil{

	public static ResponseVo success(){
		return vo(200,null,null);
	}

	public static ResponseVo success(String msg){
		return vo(200, msg,null);
	}

	public static ResponseVo success(String msg, Object data){
		return vo(200, msg, data);
	}

	public static ResponseVo error(){
		return vo(500,null,null);
	}

	public static ResponseVo error(String msg){
		return vo(500, msg,null);
	}

	public static ResponseVo error(String msg, Object data){
		return vo(500, msg,data);
	}
	
	public static ResponseVo vo(Integer status, String message, Object data) {
		return new ResponseVo<>(status, message, data);
	}



}
