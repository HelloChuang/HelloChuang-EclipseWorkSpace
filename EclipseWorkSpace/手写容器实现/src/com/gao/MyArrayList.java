package com.gao;

import java.util.Iterator;

public class MyArrayList {
	Object[] element;
	private int size;
	
	public MyArrayList(int number) {
		if(number<=0) {
			throw new IllegalArgumentException();
		}else {
			this.element = new Object[number];
		}
	}
	public MyArrayList() {
		this(10);
	}
	public void add(Object o) {
		if(size==element.length) {
			Object[] newArr = new Object[size << 2 + 2];
			System.out.println("copy and expend");
			for(int i = 0;i<element.length;i++) {
				newArr[i] = element[i];
			
			}
			element = newArr;
		}
		
		element[size++] = o;
		
	}
	public void remove(int index) {
		rangeCheck(index);
		int remainedElement = size - index -1;
		if (remainedElement>0) {
			System.arraycopy(element, index+1, element, index, remainedElement);
		}
		element[--size] = null;
	}
	public void remove(Object o) {
		for (int i = 0; i < size; i++) {
			if(get(i).equals(o)) {
				remove(i);
			}
		}
//		for (int i = 0; i < element.length; i++) {
//			if(element[i]== o) {
//				System.arraycopy(element, i+1, element, i, size-i-1);
//				
//			}
//		}
		
		element[--size] = null;
	}
	private void rangeCheck(int index) {
		if(index<0||index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}
	public void set(int index,Object o) {
		element[index] = o;
	}
	public Object get(int index) {
		rangeCheck(index);
		return element[index];
	}
	public boolean isEmpty() {
		return this.size==0 ? true:false;
			
		
	}
	public int size() {
		return this.size;
	}
}
