package com.gao.test4;

public class Test13 {
	public static void main(String[] args) {
	
		Runn runn = new Runn();
		new Thread( runn,"线程1").start();
		new Thread( runn,"线程2").start();
		new Thread( runn,"线程3").start();
		
		runn.b = false;
		new Thread( runn,"线程4").start();
		
		
		
	}
}
class  Runn implements Runnable{
	
	static boolean b = true;
	
	@Override
	public void run() {
		
			
			synchronized(this){
			
					if(b){
						System.out.println(Thread.currentThread().getName()+"进来了");
						
					}else{
						System.out.println(Thread.currentThread().getName()+"进来了");
						System.out.println("唤醒其余三个线程!");
						this.notifyAll();
					}
				
					
					
					
					
						
				
				}
			
		
	}
	
	
}
class Flag{
	
}