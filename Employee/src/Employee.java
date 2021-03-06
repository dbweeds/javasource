import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	static List<EmployeeVO> list = new ArrayList<EmployeeVO>();
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Connection 객체를 생성해주는 메서드
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "employeedb";
			String password = "12345";
			
			con  = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return con;
	}
	
	//객체 연결 종료 메서드
	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public double realPay() {
		return ((pay - ((pay*0.033)+(pay*0.045)+(pay*0.008)))/12);
	}
	
	
}
	