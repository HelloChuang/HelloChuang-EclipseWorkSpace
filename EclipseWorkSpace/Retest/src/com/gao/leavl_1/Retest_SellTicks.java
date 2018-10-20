package com.gao.leavl_1;

public class Retest_SellTicks {
	public static void main(String[] args) {
		Runnable runn = new Runnable(){
			int i = 1;
			@Override
			public void run() {
				for(;i<10;){
					synchronized (this) {
						if(i<10){
							System.out.println(Thread.currentThread().getName()+"-----"+i);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
						i++;
						
					}
				}
			}
		};
		new Thread(runn,"站台1").start();
		new Thread(runn,"站台2").start();
		new Thread(runn,"站台3").start();
	}
}
