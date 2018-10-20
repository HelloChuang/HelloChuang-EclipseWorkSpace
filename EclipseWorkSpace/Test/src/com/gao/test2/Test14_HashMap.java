package com.gao.test2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
@SuppressWarnings("all")
public class Test14_HashMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		Map map2 = new HashMap();
		
		map.put("January", "一月");//放入键值对
		map.put("February", "二月");
		map.put("March", "三月");
		map2.putAll(map);		//放入别的Map对象
		map.get("March");		//通过键获取值
		map.isEmpty();			//Map对象是否为空
		map.size();				//有多少对
		map.containsKey("February");	//是否含有这个键
		map.containsValue("一月");		//是否含有这个值
		map.remove("January");			//移除该键值对
		//三种方式遍历Map
		//方式1.使用keySet（）方法获得Set对象，使用Set中的迭代器进行遍历，
		//其中的Set对象都是Key，要获得value还要使用map.get()方法
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key+" = "+value);
		}
		//方式2.使用Map的Entry内部接口entrySet方法获得映射对象并返回Set，这个对象包括key和value
		//然后通过Entry接口的getKey和getValue方法获得队形的key和value
		Set entrySet = map.entrySet();
		Iterator it2 = entrySet.iterator();
		while(it2.hasNext()){
			Map.Entry entry = (Entry)it2.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " = "+value);
		}
		//方式3.key通过Map的keySet方法返回Set类型的对象，value通过Map的values方法返回Collection类型的对象
		//分别调用对应的迭代器进行遍历
		Set keySet2 = map.keySet();
		Collection values = map.values();
		Iterator it3 = keySet2.iterator();
		Iterator it4 = values.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next()+" = "+it4.next());
		}

		map.clear();  //将map中的键值对清空
	
	}
}
