package com.hainiu.demo3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		// 启动一个 服务端  服务器		指明了 12345 端口
		ServerSocket server = new ServerSocket(12345);
		
		while( true){
			System.out.println("开始监听");
			// 监听本机的 12345 端口	只要有 socket 连接就会结束阻塞状态
			// 结束阻塞时 会得到一个 socket 对象  我们可以使用该对象 和 客户端进行通信
			Socket socket = server.accept();
			String hostName = socket.getInetAddress().getHostName();
			System.out.println(hostName+" 连接成功 ");
			
			
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
		}
		
		
	}
}



