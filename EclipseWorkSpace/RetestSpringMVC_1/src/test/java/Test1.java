import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gao.entity.UserInfo;
import com.gao.service.UserService;

public class Test1 {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserService us = context.getBean(UserService.class);
	public static void main(String[] args) throws Exception{
		Test1 t = new Test1();
		//t.insert();
		t.find();
	}
	@Test
	public void delete()throws Exception{
		UserInfo user = us.findUserByID(4);
		us.delete(user);
	}
	public void update()throws Exception{
		UserInfo user = us.findUserByID(4);
		user.setUname("jiji");
		us.update(user);
	}
	public void find()throws Exception{
		List<UserInfo> list = us.findUserPageList(1, 10);
		System.out.println(us.findUserPageCount());
		for (UserInfo userInfo : list) {
			System.out.println(userInfo);
		}
	}
	public void insert()throws Exception{
		UserInfo user = new UserInfo();
		user.setUname("jiji");
		us.insert(user);
	}
	
}
