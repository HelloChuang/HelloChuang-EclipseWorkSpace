package com.gao.work;

public interface ApplyInfoDao {
	void apply(String name,int age,String classs,String game);
	void selectByClass(String classs);
	void selectByGame(String game);
	void concelApply(String name);
}
