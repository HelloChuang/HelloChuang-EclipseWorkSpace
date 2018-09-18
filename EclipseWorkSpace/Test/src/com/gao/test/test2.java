package com.gao.test;

import org.apache.log4j.Logger;

public class test2 {
	public static void main(String[] args)  {
			//注册日志组件  两种方法都可以
			Logger log = Logger.getLogger(test2.class);
			//Logger log = Logger.getLogger(test2.class.getName());
			log.info("启动！");
			log.debug("ss");
			log.warn("ss"); 
			log.error("ss");
			log.fatal("失败！");
}
}
