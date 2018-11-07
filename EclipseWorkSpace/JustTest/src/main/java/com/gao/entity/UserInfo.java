package com.gao.entity;

import java.util.Date;

public class UserInfo {
	private Integer uid;
	private String uname;
	private Date udate;
	private Double umoney;
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the udate
	 */
	public Date getUdate() {
		return udate;
	}
	/**
	 * @param udate the udate to set
	 */
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	/**
	 * @return the umoney
	 */
	public Double getUmoney() {
		return umoney;
	}
	/**
	 * @param umoney the umoney to set
	 */
	public void setUmoney(Double umoney) {
		this.umoney = umoney;
	} 
	
	
}
