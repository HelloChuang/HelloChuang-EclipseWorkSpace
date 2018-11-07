package com.gao.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private Integer sid;
	private String sname;
	private Integer sex;
	private Date birthday;
	private String examnum;
	private Integer scid;
	private String scname;
	private Integer aid;
	private String aname;
	private Map<String,Integer> scores = new HashMap<String,Integer>();
	/**
	 * @return the sid
	 */
	public Integer getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the sex
	 */
	public Integer getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the examnum
	 */
	public String getExamnum() {
		return examnum;
	}
	/**
	 * @param examnum the examnum to set
	 */
	public void setExamnum(String examnum) {
		this.examnum = examnum;
	}
	/**
	 * @return the scid
	 */
	public Integer getScid() {
		return scid;
	}
	/**
	 * @param scid the scid to set
	 */
	public void setScid(Integer scid) {
		this.scid = scid;
	}
	/**
	 * @return the scname
	 */
	public String getScname() {
		return scname;
	}
	/**
	 * @param scname the scname to set
	 */
	public void setScname(String scname) {
		this.scname = scname;
	}
	/**
	 * @return the aid
	 */
	public Integer getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	/**
	 * @return the aname
	 */
	public String getAname() {
		return aname;
	}
	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}
	/**
	 * @return the scores
	 */
	public Map<String, Integer> getScores() {
		return scores;
	}
	/**
	 * @param scores the scores to set
	 */
	public void setScores(Map<String, Integer> scores) {
		this.scores = scores;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", birthday=" + birthday + ", examnum="
				+ examnum + ", scid=" + scid + ", scname=" + scname + ", aid=" + aid + ", aname=" + aname + ", scores="
				+ scores + "]";
	}  

	
	
}
