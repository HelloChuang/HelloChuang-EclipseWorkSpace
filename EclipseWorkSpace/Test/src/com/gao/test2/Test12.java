package com.gao.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
@SuppressWarnings("all")
public class Test12 {
	
	public static void main(String[] args) {
		Collection c = new ArrayList();
		//ArrayList
		//几个构造方法
		
		ArrayList arraylist = new ArrayList();
		ArrayList arrayList2 = new ArrayList(c);
		ArrayList arrayList3 = new ArrayList(10);
		
		arraylist.add("郜创");
		arraylist.add("郜创");
		arraylist.add("郜创");
		
		arraylist.add(1, "郜创新");
		arraylist.remove("郜创");
		Iterator iterator = arraylist.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
		System.out.println("===================");
		ListIterator listIterator = arraylist.listIterator(1);//从指定位置开始迭代器
		while(listIterator.hasNext()){
			listIterator.hasPrevious();
		//	listIterator.previous();	
		//	listIterator.nextIndex();
		
			System.out.println(listIterator.next());
		}
		listIterator.set("hehe");
		System.out.println(arraylist);//用指定元素替换 next 或 previous 返回的最后一个元素（可选操作）。
		
		
		
		
		
	}
}
