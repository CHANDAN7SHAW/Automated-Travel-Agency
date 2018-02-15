package jdbc;
//import your required package
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Dbconfig {
	
	//declare the credentials
	public static final String USERNAME="BMR";
	public  static final String PASSWORD="12345";
	public static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String DRIVERNAME="oracle.jdbc.driver.OracleDriver";
	
	static Connection con;
	
	//make your connection
	
	public static Connection getCon(){
		try {
			//3.1 Load your class into memory by calling forname
			Class.forName(DRIVERNAME);
			con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	public static void main(String[] args) {
		
		Dbconfig.getCon();
	}

}
