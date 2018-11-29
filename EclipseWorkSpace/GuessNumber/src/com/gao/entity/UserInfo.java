package com.gao.entity;

public class UserInfo {
	private Integer id = 1;      //用户ID id
	private String uname = "";    //昵称      uname
	private Integer tg = 0;		 //总对局   total_game
	private Double wr = 0.0;      //胜率         win_rate
	private Integer ws = 0;		//最高连胜  winning_streak
	private Integer ls = 0;		//登录状态  logging_status
	private Integer wc = 0;     //赢的总局数  win_count
	
	/**
	 * @return the wc
	 */
	public Integer getWc() {
		return wc;
	}
	/**
	 * @param wc the wc to set
	 */
	public void setWc(Integer wc) {
		this.wc = wc;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the tg
	 */
	public Integer getTg() {
		return tg;
	}
	/**
	 * @param tg the tg to set
	 */
	public void setTg(Integer tg) {
		this.tg = tg;
	}
	/**
	 * @return the wr
	 */
	public Double getWr() {
		return wr;
	}
	/**
	 * @param wr the wr to set
	 */
	public void setWr(Double wr) {
		this.wr = wr;
	}
	/**
	 * @return the ws
	 */
	public Integer getWs() {
		return ws;
	}
	/**
	 * @param ws the ws to set
	 */
	public void setWs(Integer ws) {
		this.ws = ws;
	}
	/**
	 * @return the ls
	 */
	public Integer getLs() {
		return ls;
	}
	/**
	 * @param ls the ls to set
	 */
	public void setLs(Integer ls) {
		this.ls = ls;
	}
	/**   
	 * Title: toString   
	 * Description:   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	/**   
	 * Title: toString   
	 * Description:   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */  
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", uname=" + uname + ", tg=" + tg + ", wr=" + wr + ", ws=" + ws + ", ls=" + ls
				+ ", wc=" + wc + "]";
	}  
	
	
	
	
	
	
}
