import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gao.entity.Student;
import com.gao.service.StuService;

public class Test1 {

	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.setSname("IG");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StuService service = context.getBean(StuService.class);
		
		int count = service.insert(s);
		System.out.println(count);
	}
	
}
