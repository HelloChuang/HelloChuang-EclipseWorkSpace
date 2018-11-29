import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gao.entity.BookInfo;
import com.gao.service.BookService;

public class Test1 {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BookService bs = context.getBean(BookService.class);
	public static void main(String[] args) throws Exception{
		Test1 t = new Test1();
		t.insert();
		//t.find();
		

		
	}
	public void insert(){
		Random random = new Random();
		for (int i = 1; i <= 500; i++) {
			BookInfo info = new BookInfo();
			info.setBid(i);
			info.setBa(i+"的自传");
			info.setBname(i+"代目");
			info.setBprice(random.nextInt(100000)+0.00); //转化为double
			info.setBdate(new Date());
			try {
				bs.insert(info);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void find()throws Exception{
		List<BookInfo> list = bs.findBookByPageList(1, 10);
		System.out.println(list);
	}
}
