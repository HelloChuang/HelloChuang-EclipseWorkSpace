package com.gao.test1025;

public interface StudentInfoDao {
	void insertStu();
	void updateStu();
	void deleteStuUnrecoverable();
	void deleteSturestorability();
	void initTable() throws Exception;
}
