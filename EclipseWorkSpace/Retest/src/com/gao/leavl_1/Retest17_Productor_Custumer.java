package com.gao.leavl_1;

public class Retest17_Productor_Custumer {
	public static void main(String[] args) {
		Call call = new Call();
		new Thread(new SC(call)).start();
		new Thread(new XF(call)).start();
	}
}
class SC implements Runnable{
	Call call;
	public SC(Call call){
		this.call = call;
	}
	@Override
	public void run() {
		int i = 1;
		while(true){
			synchronized (call) {
				if(i%2==0){
					call.setName("大哥大");
				}
				else{
					call.setName("诺基亚");
				}
				System.out.println("生产:::"+call.getName());
				call.notify();
				try {
					Thread.sleep(100);
					call.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;
			}
			
		}
		
	}
	
}
class XF implements Runnable{
	Call call;
	public XF(Call call){
		this.call = call;
	}
	@Override
	public void run() {
		while(true){
			synchronized (call) {
				System.out.println("消费::"+call.getName());
				call.notify();
				try {
					call.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
}
class Call{
	String name;
	
	public Call() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Call(String name) {
		super();
		this.name = name;
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