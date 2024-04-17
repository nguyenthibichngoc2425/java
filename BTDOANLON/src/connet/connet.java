package connet;
import java.sql.*;
/**
 *
 * @author HP
 */
public class connet {
	public static Connection getConnection() {
		Connection conn = null;
		try{ 
			   String userName = "root";
			   String password = "";
			   String DatabaseName = "ql_ts10";
			   String url = "jdbc:mysql://localhost/" + DatabaseName;
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   conn = DriverManager.getConnection(url, userName, password);
			   System.out.println("Ok");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		connet.getConnection();
	}
}