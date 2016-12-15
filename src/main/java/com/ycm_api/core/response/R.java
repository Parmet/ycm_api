package com.ycm_api.core.response;

import java.io.Serializable;

import com.ycm_api.core.data.Const;

public class R implements Serializable
{
	private static final long serialVersionUID = 6682506847040116832L;
	private int code;
	private String msg;
	private Object data;
	
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	public void success(Object data) {
		this.code = Const.R_CODE_SUCCESS;
		this.msg = Const.R_MSG_SUCCESS;
		this.data = data;
	}

	public void fail(int code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	/**
	 * 异常
	 */
	public void exception(){
		this.code = Const.R_SYS_EXCEPTION;
		this.msg = Const.R_MSG_EXCEPTION;
	}
	
}
