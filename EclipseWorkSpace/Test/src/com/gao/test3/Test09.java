package com.gao.test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
@SuppressWarnings("all")
public class Test09 {
	public static void main(String[] args) {
		String s ="abcde12345jkabc12abcde367";
		HashMap<Character,Integer> map = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			Integer in = map.get(s.charAt(i));
			map.put(s.charAt(i), in = in==null?1:in+1);
		}
		Set<Character> set = map.keySet();
		Iterator<Character> it = set.iterator();
		while(it.hasNext()){
			Character next = it.next();
			Integer integer = map.get(next);
			System.out.print(next+"("+integer+")");
		}
	}
}
