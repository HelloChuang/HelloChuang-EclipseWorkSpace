import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JdbcUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://127.0.0.1:3306/jdbcdb?characterEcoding=UTF-8";
	private static final String USER = "root";
	private static final String PSWD = "root";
	
	private static ComboPooledDataSource dataSource;
	static{
		 dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass(DRIVER);
			dataSource.setJdbcUrl(URL);
			dataSource.setUser(USER);
			dataSource.setPassword(PSWD);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn =  dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
//	public static Connection getConnection() throws Exception{
//		Class.forName("DRIVER");
//		Connection conn = (Connection) DriverManager.getConnection(URL);
//		return conn;
//	}
	public static void closeAll(ResultSet set,PreparedStatement stat,Connection conn){
		try {
			if(null!=set){
				set.close();
			}
			if (null != stat) {
				stat.close();
			}
			if (null != conn) {
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
