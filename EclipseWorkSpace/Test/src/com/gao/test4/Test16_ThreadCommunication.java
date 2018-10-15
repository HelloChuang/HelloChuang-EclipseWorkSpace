package com.gao.test4;

public class Test16_ThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		Thread ct = Thread.currentThread();
		ct.setPriority(6);				//设置main线程的优先级
		System.out.println(ct);			//main线程的信息，【线程名，优先级，所属的线程组】
		
		ThreadCommunication tc = new ThreadCommunication();
		Thread t = new Thread(tc,"线程1");
		System.out.println(t);
		
		Thread t2 = new Thread(tc,"线程2");
		
		t.setPriority(4);
		t.start();
		//t.join();
		t.yield();
		t2.setPriority(5);
		t2.start();
		
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(100);
			System.out.println(ct.getName());
		}
	}
}
class ThreadCommunication implements Runnable{
	int i = 0;
	@Override
	public void run() {
		for (; i < 10; ) {
			synchronized (this) {
				
				System.out.println(Thread.currentThread().getName());
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