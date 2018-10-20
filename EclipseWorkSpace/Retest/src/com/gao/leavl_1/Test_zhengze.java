package com.gao.leavl_1;

import java.io.File;

public class Test_zhengze {
	public void deleteFile(File file){
		if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				deleteFile(file2);
			}
			file.delete();
		}
	}
}

