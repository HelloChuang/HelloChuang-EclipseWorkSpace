package com.hainiu.demo1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		// 启动一个 服务端  服务器		指明了 12345 端口
		ServerSocket server = new ServerSocket(12345);
		
		// 监听本机的 12345 端口	只要有 socket 连接就会结束阻塞状态
		// 结束阻塞时 会得到一个 socket 对象  我们可以使用该对象 和 客户端进行通信
		Socket socket = server.accept();
		System.out.println("mian - gg");
	}
}
