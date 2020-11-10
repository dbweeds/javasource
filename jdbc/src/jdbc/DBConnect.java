package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		
		Connection con = null;
		try {
			//오라클 드라이버 로드 (페키지 오른쪽마우스 >빌드 페스 > 컨피겨 빌드 페스)
			Class.forName("oracle.jdbc.OracleDriver");
			//localhost(본인 자신의 컴퓨터) 이자리는 호스트주소를넣는것
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javadb";
			String password = "12345";
			//db와 연결
			con = DriverManager.getConnection(url, user, password);
			if(con != null)
				System.out.println("연결되었습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//자원해체
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
