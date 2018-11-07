//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Arrays;
//import java.util.Scanner;
//
//import com.mysql.jdbc.Connection;
//
///**
// *第一遍增删改查  
// */
//public class Test01 {
//	public static void main(String[] args) throws Exception {
////		query();
//		//insert();
//		//delete();
////		update();
//		
//
//	}
//	
//	
//	
//	
//	
//	public static void query() throws Exception{
//		Class.forName("com.mysql.jdbc.Driver");
//		String url = "jdbc:mysql://127.0.0.1:3306/jdbcdb?characterEcoding=UTF-8";
//		String user = "root";
//		String pswd = "root";
//		Connection conn  =  (Connection) DriverManager.getConnection(url,user,pswd);
//		String sql = "select * from person";
//		Statement stat = conn.createStatement();
//		ResultSet set = stat.executeQuery(sql);
//		while(set.next()){
//			Object [] obj  = {set.getInt("id"),set.getString("name"),
//					set.getString("sex"),set.getInt("age"),set.getString("from")};
//			System.out.println(Arrays.toString(obj));
//			}
//		set.close();
//		stat.close();
//		conn.close();
//		}
//	
//	
//	
//	
//	
//	public static void insert() throws Exception{
//		Class.forName("com.mysql.jdbc.Driver");
//		String url = "jdbc:mysql://127.0.0.1:3306/jdbcdb?characterEcoding=UTF-8";
//		String user = "root";
//		String pswd = "root";
//		Connection conn = (Connection) DriverManager.getConnection(url);
//		Statement stat = conn.createStatement();
//		
//		String sql = "insert into person(`name`,`sex`,`age`,`from`)values('叶孤城','男',37,'紫禁城')";
//		int count = stat.executeUpdate(sql);
//		String msg = count>0?"插入成功":"插入失败";
//		System.out.println(msg);
//	}
//	
//	
//	
//	public static Person findPersonByID(int id) throws Exception{
//		Person p = null;
//		Connection conn = JdbcUtil.getConnection();
//		String sql = "select * from person where id = ?";
//		PreparedStatement stat = conn.prepareStatement(sql);
//		stat.setInt(1, id);
//		ResultSet set = stat.executeQuery();
//		while(set.next()){
//			//p = new Person(set.getInt("id"),set.getString("name"),set.getString("sex"),set.getInt("age"),set.getString("from"));
//		}
//		
//		JdbcUtil.closeAll(set, stat, conn);
//		return p;
//	}
//	
//	public static void delete() throws Exception{
//		System.out.println("请输入您要删除的ID:");
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		Person person = findPersonByID(id);
//		
//		if(null!=person){
//			Connection conn = JdbcUtil.getConnection();
//			String sql = "delete from person where id = ?";
//			PreparedStatement stat = conn.prepareStatement(sql);
//			stat.setInt(1, id);
//			int count = stat.executeUpdate();
//			String msg = count>0?"删除成功":"删除失败";
//			System.out.println(msg);
//		}else{
//			System.out.println("您要删除的数据不存在");
//		}
//	}
//	
//	
//	public static void update() throws Exception{
//		System.out.println("请输入您要修改的ID:");
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		Person person = findPersonByID(id);
//		if(null!=person){
//			Connection conn = JdbcUtil.getConnection();
//			String sql = "update person set `name` = ? where id = ?";
//			PreparedStatement stat = conn.prepareStatement(sql);
//			stat.setString(1, "叶孤城");
//			stat.setInt(2, id);
//			int count = stat.executeUpdate();
//			String msg = count>0?"更新成功":"更新失败";
//			System.out.println(msg);
//		}else{
//			System.out.println("您要修改的数据不存在");
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//		
//}
//
