package com.gao;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Gaoch
 *									��ʱ���ǳ���
 */
public class Test {
	public static void main(String[] args) throws ScriptException {
		//��ȡ����ű�����
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
		
		//����������洢��������������
		engine.put("msg", "helloc");
		String str = "var user = {name:'gaochuang',age:18,school:['�廪','����']}";
		str += "println(user.name)";
		
		//ִ�нű�
		engine.eval(str);

	}
}
