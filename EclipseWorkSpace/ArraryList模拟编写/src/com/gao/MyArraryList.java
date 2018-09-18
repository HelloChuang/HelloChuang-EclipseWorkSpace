package com.gao;



public class MyArraryList {
	 private int size;
	 private Object[] data;
	 public MyArraryList() {
		 this(16);
	 }
	 public MyArraryList(int Capacity) {
		 this.data = new Object[Capacity];
	 }
	 public int size() {
		 return this.size;
	 }
	 public void add(Object o) {
		 data[size] = o;
		 size++;
		 if(size>data.length) {
			 Object[] newArray = new Object[size*2+2];
			 for(int i = 0;i<size;i++) {
				 newArray[i] = this.data[i];
			 }
			 data = newArray;
		 }
	 }
}
