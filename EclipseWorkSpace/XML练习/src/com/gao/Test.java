package com.gao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("x.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
	}
}
