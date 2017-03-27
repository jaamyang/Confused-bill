package newUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static String ip = "127.0.0.1";
	static int port = 3306;
	static String database = "allbill";
	static String encoding = "UTF-8";
	static String loginName = "root";
	static String password = "123456";
	
	static{
		try{
			new com.mysql.jdbc.Driver();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
		return DriverManager.getConnection(url, loginName, password);
	}
}
