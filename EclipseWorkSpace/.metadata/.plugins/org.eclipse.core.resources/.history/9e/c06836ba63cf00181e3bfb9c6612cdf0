package com.gao.test4;

public class Test15_Deadlock2 {
	public static void main(String[] args) throws InterruptedException {
		Deadlock2 d2 = new Deadlock2();
		
		
		
		new Thread(d2,"线程1").start();
		
		//Thread.sleep(100);//为什么非要加这个才能检测到死锁呢？假如不加,线程1和d2.b=false;会一起执行,线程1和线程2都会去获取obj2锁
		d2.b = false;
		new Thread(d2,"线程2").start();
		
		
		
	
	}
}
class Deadlock2 implements Runnable{
	boolean b = true;
	Object obj1 = new Object();
	Object obj2 = new Object();
	@Override
	public void run() {
		if(b){
			System.out.println(Thread.currentThread().getName()+"等待获取obj1锁");
			synchronized (obj1) {
				System.out.println(Thread.currentThread().getName()+"获取到了obj1锁");
				
				try {Thread.sleep(1000);	} catch (InterruptedException e) {e.printStackTrace();}
					
				
				System.out.println(Thread.currentThread().getName()+"等待获取obj2锁");
				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName()+"获取到了obj2锁");
				}
				System.out.println(Thread.currentThread().getName()+"释放obj2锁");
			}
			System.out.println(Thread.currentThread().getName()+"释放obj1锁");
		}else{
			System.out.println(Thread.currentThread().getName()+"等待获取obj2锁");
			synchronized (obj2) {
				System.out.println(Thread.currentThread().getName()+"获取到了obj2锁");
				
				try {Thread.sleep(1000);	} catch (InterruptedException e) {e.printStackTrace();}
				System.out.println(Thread.currentThread().getName()+"等待获取obj1锁");
				synchronized (obj1) {
					System.out.println(Thread.currentThread().getName()+"获取到了obj1锁");
				}
				System.out.println(Thread.currentThread().getName()+"释放obj1锁");
			}
			System.out.println(Thread.currentThread().getName()+"释放obj2锁");
		}
		
	}
	
}