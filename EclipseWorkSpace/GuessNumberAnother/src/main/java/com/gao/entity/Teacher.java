package com.gao.entity;

public class Teacher {
	private String tid;
	private String tname;
	private String tbir;
	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}
	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	/**
	 * @return the tbir
	 */
	public String getTbir() {
		return tbir;
	}
	/**
	 * @param tbir the tbir to set
	 */
	public void setTbir(String tbir) {
		this.tbir = tbir;
	}
	/**   
	 * Title: toString   
	 * Description:   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */  
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tbir=" + tbir + "]";
	}
	
	
}
