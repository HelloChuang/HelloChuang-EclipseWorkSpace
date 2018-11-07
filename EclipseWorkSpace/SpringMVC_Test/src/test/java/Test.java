

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gao.dao.UserDAO;
import com.gao.dao.impl.UserDAOImpl;
import com.gao.entity.UserInfo;
import com.gao.service.UserService;

public class Test {
	//找到xml中所有的bean对应的类 并全部实例化
	private  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	//将找到的对象与getBean()方法中所穿的参数一一对照,并自动向上找    如果有多个实现类的话那就要指定具体的类型了
	private  UserService us = context.getBean(UserService.class);
	//private static UserDAO userDao = (UserDAO)context.getBean("userDAO");
	
	public static void main(String[] args) {
		 Test test = new Test();
		 //test.insert();
		// test.update();
		//test.delete();
		 
		 test.find();
		
	}
	public void insert(){
		UserInfo user = new UserInfo();
		user.setUname("11.1");
		user.setUdate(new Date());
		user.setUmoney(1235.54);
		try {
			us.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(){
		try {
			UserInfo user = us.findUserByID(3);
			user.setUname("11.1");
			user.setUdate(new Date());
			user.setUmoney(1235.54);
			int update = us.update(user);
			System.out.println(update);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(){
		try {
			UserInfo user = us.findUserByID(3);
			us.delete(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void find(){
		int totalCount = 0;
		int totalPage = 0;
		int pageIndex = 1;
		int pageSize = 10;
		try {
			totalCount = us.findUserCount();
			totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
			System.out.println(totalCount+" "+totalPage+" "+ pageIndex+" "+pageSize);
			List<UserInfo> list = us.findUserByPageList(pageIndex, pageSize);
			for (UserInfo userInfo : list) {
				System.out.println(userInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
