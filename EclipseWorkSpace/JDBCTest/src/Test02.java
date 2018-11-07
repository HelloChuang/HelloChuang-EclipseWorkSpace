import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;



/**
 *  包一定要导对      Connection  是sql下的包  
 *  执行的时候注意参数
 *  当增删改时   执行语句的参数   是三个  分别是  连接对象,SQL执行语句,占位符的字符数组
 *  当查询时     执行语句的参数 是四个  分别是  连接对象,SQL执行语句,       占位符的字符数组
 */
public class Test02 {
	public static void main(String[] args) throws Exception {
		//insert();
		delete();
	}
	@Test
	public static void insert() throws SQLException{
		//获取与数据库的连接
		Connection conn = JdbcUtil.getConnection();
		//创建DBUtil工具包下的执行对象
		QueryRunner qr = new QueryRunner();
		//编写SQL语句
		String sql = "insert into person(`name`,`sex`,`age`,`from`)values(?,?,?,?)";
		//判断是否有占位符
		Object [] params = {"陆小凤","男",18,"广东省"};
		//执行  
		int count = qr.update(conn,sql,params);
		
		
		
		String msg = count>0?"插入成功":"插入失败";
		System.out.println(msg);
		JdbcUtil.closeAll(null, null, conn);
	}
	
	
	
	
	public static Person findPersonByID(int id) throws SQLException{
		Person p = null;
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from person where id = ?";
		QueryRunner qr = new QueryRunner();
		Object params [] = {id};
		p = qr.query(conn, sql,new BeanHandler<>(Person.class) ,params);
		
		JdbcUtil.closeAll(null, null, conn);
		return p;
	}
	 
	@Test
	public static void delete() throws SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出您要删除的ID:");
		int id = sc.nextInt();
		Person p = findPersonByID(id);
		if(null!=p){
			Connection conn = JdbcUtil.getConnection();
			String sql = "delete from person where id = ?";
			QueryRunner qr = new QueryRunner();
			
			int count = qr.update(conn,sql,id);
			String msg = count>0?"删除成功":"删除失败";
			System.out.println(msg);
			JdbcUtil.closeAll(null, null, conn);
		}else{
			System.out.println("请输入正确的ID");
		}
	}
	
	
	public static void update() throws SQLException{
		System.out.println("请输入您要更新的ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Person p = findPersonByID(id);
		if(null!=p){
			Connection conn = JdbcUtil.getConnection();
			String sql = "update person set `name`=?,sex=? where id = ?" ;
			QueryRunner qr = new QueryRunner();
			Object [] params = {"郜创","男",id};
			int count = qr.update(conn,sql,params);
			String msg = count>0?"更新成功":"更新失败";
			System.out.println(msg);
			
			JdbcUtil.closeAll(null, null, conn);
		}else{
			System.out.println("请输入正确的ID");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
