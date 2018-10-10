package com.gao.test3;

import java.util.Comparator;

public class Comp implements Comparator<Student>{
	
	@Override
	public int compare(Student s1,Student s2) {
		int result = 0;
		result = s1.getAge()-s2.getAge();
		return result;
	}

}
