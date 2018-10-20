package com.gao.test2;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
public class Test09_List {
	public static void main(String[] args) {
		//List的特点：有索引，有序，不唯一
		//增加的规定和方法：
		List list = new ArrayList();
		List list2 = new ArrayList();
		list.add("床前明月光");  //往末尾添加元素
		list.add("疑是地上霜");
		list.add("举头望明月");
		list.add("低头思故乡");
		
		list.add(0, "作者：李白");   //在索引0处插入该对象
		list2.addAll(0,list);			//从list2的索引0开始，将list复制到list2中
		list.get(1);				//获得索引为1处的元素
		list.indexOf("举头望明月");		//获得该元第一次出现的索引
		list.lastIndexOf("举头望明月");	//获得该元素从后往前第一次出现的索引
		list.remove(0);				//删除索引为0位置的元素
		list.set(0, "作者：李白");		//将索引0处的元素设置为该对象
		List subList = list.subList(0, 2);			 //截取一部分返回新的List
		
		
		//总结：多出来的方法几乎都是可以操作索引的，可以说有索引是List的最大特点，就像增强版的数组
	}
}
