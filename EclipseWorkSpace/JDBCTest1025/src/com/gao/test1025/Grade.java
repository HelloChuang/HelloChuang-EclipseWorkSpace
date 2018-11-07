package com.gao.test1025;

public class Grade {
	private int g_id;
	private String g_name;
	/**
	 * @return the g_id
	 */
	public int getG_id() {
		return g_id;
	}
	/**
	 * @param g_id the g_id to set
	 */
	public void setG_id(int g_id) {
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
		return "Grade [g_id=" + g_id + ", g_name=" + g_name + "]";
	}
	
}
