package com.gao.test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *使用对象流循环读取 文件中的所有对象
 */
@SuppressWarnings("all")
public class Test09_objectst {
	public static void main(String[] args) {
//		write();
		read();
	}
	public static void read(){
		ObjectInputStream ois = null;
		ArrayList<Son> list = new ArrayList<>();
		try {
			ois = new ObjectInputStream(new FileInputStream("d:\\testObj.txt"));
			
			while(true){
				Object o = ois.readObject();
				Son s = null;
				if(o instanceof Son){
					s = (Son)o;
				}
				list.add(s);
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("读取完毕!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
				for (Son s : list) {
					System.out.println(s);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void write(){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\testObj.txt",true));
			oos.writeObject(new Son(18,"郜创"));
			oos.writeObject(new Son(1,"郜创新"));
			oos.writeObject(new Son(15,"创"));
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


class Son implements Serializable{
	int age;
	String name;
	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Son(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Son [age=" + age + ", name=" + name + "]";
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}