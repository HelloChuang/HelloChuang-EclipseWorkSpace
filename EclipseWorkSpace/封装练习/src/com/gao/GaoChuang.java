package com.gao;

public class GaoChuang extends User{
	public  GaoChuang() {
		System.out.println("this is child");//默认会调用super（）；自下往上调用构造方法，直至Object
	}
}
