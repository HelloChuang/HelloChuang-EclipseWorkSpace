package com.hainiu.demo2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestSocket {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 开启一个客户端  要指明连接的服务端的 ip 端口号
		// 如果连接建立成功  我们依靠该对象 和 服务端进行通信
		Socket socket = new Socket("192.168.31.76",12345);
		System.out.println("我是客户端");
		
		// 获取输入流
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		// 读取 服务端发送的消息 
		String str = dis.readUTF();
		System.out.println("收到服务器的消息如下 \n "+str);
		
		
		// 获取输出流
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner sc = new Scanner(System.in);
		
		
		dos.writeUTF(sc.nextLine());
		dos.flush();
		
		
		System.out.println("客户端结束了");
	}
}
