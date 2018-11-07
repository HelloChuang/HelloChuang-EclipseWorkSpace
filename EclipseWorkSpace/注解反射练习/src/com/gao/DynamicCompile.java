package com.gao;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class DynamicCompile {
	public static void main(String[] args) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		compiler.run(null, null, null,"d:/test.java");
		
	}
}
