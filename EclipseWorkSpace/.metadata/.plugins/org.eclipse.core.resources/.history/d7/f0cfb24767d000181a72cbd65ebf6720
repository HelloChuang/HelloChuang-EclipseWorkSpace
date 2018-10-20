package com.hainiu.demo2;

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
		
		
		System.out.println("开始监听");
		
		// 监听本机的 12345 端口	只要有 socket 连接就会结束阻塞状态
		// 结束阻塞时 会得到一个 socket 对象  我们可以使用该对象 和 客户端进行通信
		Socket socket = server.accept();
		
		// 来到这里代表 有客户端连接了    我们要发送一条消息出去
		
		// 获得输出流 
		OutputStream os = socket.getOutputStream();
		// 封装成数据流
		DataOutputStream dos = new DataOutputStream(os);
		
		String str = "靓仔 你是边个 ?" ;
		
		dos.writeUTF(str);
		dos.flush();
		
		System.out.println("服务端向客户端发送了消息  :   "+str);
		
		
		
		// 接收客户端的消息  
		
		// 获取输入流
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		// 读取 服务端发送的消息 
		String read = dis.readUTF();
		System.out.println("收到服务器的消息如下 \n "+read);
		
		
		System.out.println(socket.getInetAddress().getHostName());
		
		
		System.out.println("服务器关闭了");
		
		
	}
}



