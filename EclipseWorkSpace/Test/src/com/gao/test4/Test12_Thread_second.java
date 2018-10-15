package com.gao.test4;

import java.io.Serializable;

/**
 *  第二种创建多线程的方法
 *  
 */
public class Test12_Thread_second {
	public static void main(String[] args) {
		Runnable t1 = new TestThread2();
	
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t1);
		Thread thread3 = new Thread(t1);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
class TestThread2 implements Runnable{
	int i = 0;
	
	@Override
	public void run() {
		for (; i < 10; ) {
				synchronized(this){
					System.out.println(Thread.currentThread().getName()+" :  "+i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					i++;
				}
			
		
			
		}
		
	}

}
class Man implements Serializable{
	public void show(){
		System.out.println("sss");
		System.out.println("sss");
		System.out.println("sss");
		//System.out.println("sss");
	}
}