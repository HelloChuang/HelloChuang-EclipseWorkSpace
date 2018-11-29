package com.gao.entity;

import java.util.Date;

public class BookInfo {
	private Integer bid;
	private String bname;
	private String ba;
	
	private	Date bdate;
	private Double bprice;
	
	/**
	 * @return the ba
	 */
	public String getBa() {
		return ba;
	}
	/**
	 * @param ba the ba to set
	 */
	public void setBa(String ba) {
		this.ba = ba;
	}
	/**
	 * @return the bid
	 */
	public Integer getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	/**
	 * @return the bdate
	 */
	public Date getBdate() {
		return bdate;
	}
	/**
	 * @param bdate the bdate to set
	 */
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	/**
	 * @return the bprice
	 */
	public Double getBprice() {
		return bprice;
	}
	/**
	 * @param bprice the bprice to set
	 */
	public void setBprice(Double bprice) {
		this.bprice = bprice;
	}
	/**   
	 * Title: toString   
	 * Description:   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */  
	@Override
	public String toString() {
		return "BookInfo [bid=" + bid + ", bname=" + bname + ", bdate=" + bdate + ", bprice=" + bprice + "]";
	}
	
	
}
