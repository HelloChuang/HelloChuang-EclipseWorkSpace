package com.gao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test_TransformationFlows {
	public static void main(String[] args) throws IOException {
		Reader reader = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		
		Writer writer = new OutputStreamWriter(System.out);
		
		BufferedWriter bw = new BufferedWriter(writer);
		
		bw.write(line);
		bw.newLine();
		bw.flush();
		
		
		
		
		
	}
}
