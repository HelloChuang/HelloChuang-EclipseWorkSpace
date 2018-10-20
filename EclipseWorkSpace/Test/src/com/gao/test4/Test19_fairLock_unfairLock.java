package com.gao.test4;

import java.util.concurrent.locks.ReentrantLock;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test19_fairLock_unfairLock {
	public static void main(String[] args) {
		TestLock tl = new TestLock();
		new Thread(tl,"线程1").start();
		new Thread(tl,"线程2").start();
		new Thread(tl,"线程3").start();
		new Thread(tl,"线程4").start();
		new Thread(tl,"线程5").start();
		
		
		
	}
}
class TestLock implements Runnable{
	//ReentrantLock rl = new ReentrantLock();
	@Override
	public void run() {
			for(int i = 0; i<2;i++){
				synchronized (this) {
					
					try {
						System.out.println(Thread.currentThread().getName()+"正在等待");
						//rl.lock();
						System.out.println(Thread.currentThread().getName()+"得到锁");
						Thread.sleep(100);
					} catch (Exception e) {
					}finally {
						//rl.unlock();
						System.out.println(Thread.currentThread().getName()+"释放锁");
					}
					System.out.println("=============");
				}
				}
			
			}
		
	
}