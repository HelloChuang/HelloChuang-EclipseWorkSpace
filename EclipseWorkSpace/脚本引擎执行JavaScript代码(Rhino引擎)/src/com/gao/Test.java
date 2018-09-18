package com.gao;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Gaoch
 *									暂时总是出错
 */
public class Test {
	public static void main(String[] args) throws ScriptException {
		//获取引擎脚本对象
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
		
		//定义变量，存储到引擎上下文中
		engine.put("msg", "helloc");
		String str = "var user = {name:'gaochuang',age:18,school:['清华','北大']}";
		str += "println(user.name)";
		
		//执行脚本
		engine.eval(str);

	}
}
