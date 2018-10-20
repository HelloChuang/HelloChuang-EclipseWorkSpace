package com.hainiu.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

public class ThreadServer implements Callable<Result>{
	private static int count;
	Socket socket ;
	public ThreadServer(Socket socket) {
		this.socket = socket;
	}
	@Override
	public Result call() throws Exception {
		count++;
		long action = System.currentTimeMillis();
		Result result = new Result();
		
		
		String hostName = socket.getInetAddress().getHostName();
		System.out.println(hostName+" 连接成功 ");
		result.setHostName(hostName);
		
		
		
		/**
		 *  USER
		 */
		// 获得输出流 
		OutputStream os = socket.getOutputStream();
		// 封装成数据流
		DataOutputStream dos = new DataOutputStream(os);
		String str = "请录入要注册的用户名";
		dos.writeUTF(str);
		dos.flush();
		
		/**
		 * 接收 客户端 要注册的  USER 
		 */
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String user = dis.readUTF();
		System.out.println("客户端"+hostName+" 要注册的USER : "+user);
		
		
		
		/**
		 *  PSWD
		 */
		str = "请录入要注册的密码";
		dos.writeUTF(str);
		dos.flush();
		
		/**
		 * 接收 客户端 要注册的  PSWD 
		 */
		String pswd = dis.readUTF();
		System.out.println("客户端"+hostName+" 要注册的PSWD : "+pswd);
		System.out.println("服务器完成了对  "+hostName +" 的服务 \n\n\n");
		
		
		
		
		result.setNumber(count);
		result.setServiceResult(true);
		result.setServiceTime(System.currentTimeMillis()-action);
		
		return result;
	}

}


class Result {
	private long serviceTime;
	private boolean serviceResult;
	private String hostName;
	private int number;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(long serviceTime, boolean serviceResult, String hostName ,int number) {
		super();
		this.serviceTime = serviceTime;
		this.serviceResult = serviceResult;
		this.hostName = hostName;
		this.number = number;
	}

	public long getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(long serviceTime) {
		this.serviceTime = serviceTime;
	}

	public boolean isServiceResult() {
		return serviceResult;
	}

	public void setServiceResult(boolean serviceResult) {
		this.serviceResult = serviceResult;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Result [serviceTime=" + serviceTime + ", serviceResult=" + serviceResult + ", hostName=" + hostName
				+ ", number=" + number + "]";
	}

	
}