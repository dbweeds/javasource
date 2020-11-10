package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSelect {

	public static void main(String[] args) {
		//커낵션할때
		Connection con = null;
		//sql 문 전송
		PreparedStatement pstmt = null;
		//sql 문 결과
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javadb";
			String password = "12345";
			
			con = DriverManager.getConnection(url, user, password);
			if(con != null) {
				
				String sql = "select * from userTBL";
				
				pstmt = con.prepareStatement(sql);
				//전송된 sql문 실행 후 결과담기
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getInt(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\n");					
				}
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally {
			try {
				//나중에 열은 것을 먼저 넣어서 닫음
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
