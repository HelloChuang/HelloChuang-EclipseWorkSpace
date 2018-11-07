package com.gao.test1025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {


	private int s_id;
	private String s_name;
	private Date s_intodate;
	private Integer s_money;
	private Integer g_id;
	
	
	private String g_name;
	
	
	
	/**
	 * @return the s_id
	 */
	public int getS_id() {
		return s_id;
	}



	/**
	 * @param s_id the s_id to set
	 */
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}



	/**
	 * @return the s_name
	 */
	public String getS_name() {
		return s_name;
	}



	/**
	 * @param s_name the s_name to set
	 */
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}



	/**
	 * @return the s_intodate
	 */
	public Date getS_intodate() {
		return s_intodate;
	}



	/**
	 * @param s_intodate the s_intodate to set
	 */
	public void setS_intodate(Date s_intodate) {
		this.s_intodate = s_intodate;
	}



	/**
	 * @return the s_money
	 */
	public Integer getS_money() {
		return s_money;
	}



	/**
	 * @param s_money the s_money to set
	 */
	public void setS_money(Integer s_money) {
		this.s_money = s_money;
	}



	/**
	 * @return the g_id
	 */
	public Integer getG_id() {
		return g_id;
	}



	/**
	 * @param g_id the g_id to set
	 */
	public void setG_id(Integer g_id) {
		this.g_id = g_id;
	}



	/**
	 * @return the g_name
	 */
	public String getG_name() {
		return g_name;
	}



	/**
	 * @param g_name the g_name to set
	 */
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return s_name+" "+s_money+" "+s_intodate+" ";
	}

}
