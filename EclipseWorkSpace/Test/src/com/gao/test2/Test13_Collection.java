package com.gao.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
@SuppressWarnings("all")
public class Test13_Collection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		//LinkedList 的几种构造方法
		LinkedList linkedList = new LinkedList();
		LinkedList linkedList2 = new LinkedList(c);
		
		linkedList.add("郜创");
		linkedList.add("郜创");
		linkedList.add("郜创");
		
		linkedList.add(1,"郜创新");
		
		linkedList.remove("郜创");
		linkedList.remove(1);
		
	}
}
