package com.gao.test4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 利用阻塞队列实现 多消费者 多生产者
 */
public class Test17_Productor_Custumer2 {
	public static void main(String[] args) {
		BlockingQueue<Dj> bq = new ArrayBlockingQueue<>(10);

		SC sc = new SC(bq);
		XF xf = new XF(bq);

		new Thread(sc, "生产者1").start();
		new Thread(sc, "生产者2").start();
		new Thread(sc, "生产者3").start();

		new Thread(xf, "消费者1").start();
		new Thread(xf, "消费者2").start();
		new Thread(xf, "消费者3").start();

	}
}

class SC implements Runnable {
	BlockingQueue<Dj> bq;
	int i = 1;

	public SC(BlockingQueue<Dj> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		Dj dj = null;
		while (true) {
			synchronized (this) {
				if (i % 2 == 0) {
					dj = new Dj("五谷豆浆", "加糖");
				} else {
					dj = new Dj("豆腐脑", "加胡辣汤");
				}
				bq.add(dj);
				System.out.println(Thread.currentThread().getName() + dj);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				i++;

				// bq.notify();
				// try {
				// bq.wait();
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
			}
			

		}
	}

}

class XF implements Runnable {
	BlockingQueue<Dj> bq;

	public XF(BlockingQueue<Dj> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
	
			while (true) {
				try {
					System.out.println(Thread.currentThread().getName() + bq.take());

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		
	

	}

}

class Dj {
	String name;
	String id;

	public Dj() {
		super();
	}

	public Dj(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " name=" + name + ", id=" + id + "";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}