package com.gao.test4;

/**
 *  第一种启动线程的方式
 */
@SuppressWarnings("all")
public class Test11_Thread_first {
	public static void main(String[] args) {
		TestThread station1 = new TestThread(" 站台1:");
		TestThread station2 = new TestThread(" 站台2:");
		TestThread station3 = new TestThread(" 站台3:");
		station1.start();
		station2.start();
		station3.start();
	}
}
class TestThread extends Thread{
	static int i = 0;
	public TestThread(String name){
		super(name);
	}
	@Override
	public void run() {
		for (; i < 10; i++) {
			try {
				System.out.println(getName()+"  : "+i);
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}