package com.gao;
import java.util.Date;
import java.sql.*;  //sql��Ҳ��һ����Date���࣬���ʱ��Ͷ����룬���õ�ʱ��Ѱ���Ҳд��

import static java.lang.Math.PI;  //������ֱ�ӵ��ø���ľ�̬���ԣ��Ӷ�����ֱ��ʹ�ø���ľ�̬����
 /**
 * @author Gaoch
 *包和静态导入
 *
 */
public class Test_PackagesAndStaticImports {
	public static void main(String[] args) {
		java.util.Date date = new Date();
		System.out.println(PI);
		System.out.println(date.toString());
	}
}