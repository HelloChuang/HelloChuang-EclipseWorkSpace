package com.gao.test;

import org.apache.log4j.Logger;

public class test2 {
	public static void main(String[] args)  {
			//ע����־���  ���ַ���������
			Logger log = Logger.getLogger(test2.class);
			//Logger log = Logger.getLogger(test2.class.getName());
			log.info("������");
			log.debug("ss");
			log.warn("ss"); 
			log.error("ss");
			log.fatal("ʧ�ܣ�");
}
}
