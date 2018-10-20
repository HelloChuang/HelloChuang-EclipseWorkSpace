package com.gao.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
@SuppressWarnings("all")
public class Test08_Collection {
	public static void main(String[] args) {
		//集合
		//Collection中的方法
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		
		
		c1.add("床前明月光");  //往末尾添加元素
		c1.add("疑是地上霜");
		c1.add("举头望明月");
		c1.add("低头思故乡");
		
		System.out.println(c1);
		c2.addAll(c1);			//把c1元素全加到c2中
		System.out.println(c2);
		c1.contains("床前明月光");	//c1是否有该对象
		c1.remove("疑是地上霜");	//移除c1中的该对象
		c1.clear();				//移除c1中所有元素
		c1.isEmpty();			//c1是否为空
		c1.equals(c2);			//c1和c2是否在逻辑上相等
		c2.removeAll(c1);		//移除c2中所有包含c1的
		c1.retainAll(c2);		//在c1中留下和c2一样的元素
		c1.size();				//c1的大小
		Object[] array = c1.toArray();	//将c1转化为Object数组
		
		Iterator it = c1.iterator();		//迭代器遍历方法
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();		//与普通的foreach不同，此迭代器有remove方法
		}
		
	}
}
