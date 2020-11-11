package Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static Persistence.JDBCUtil.*;
import Domain.UserVO;

public class UserDAO {
	Connection con;
	
	public UserDAO(Connection con) {
		super();
		this.con = con;
	}
	public List<UserVO> getList() {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();
		
		try {
			
			// select : 여러 행의 결과가 출력(ArrayList)되는 것인지 아니면 하나의 행만
			//출력되는 것(~~VO)인지에 따라 담을 객체가 결정
			String sql = "select * from userTBL";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {//
				UserVO user = new UserVO();
				user.setNo(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setBirthYear(rs.getInt("birthYear"));
				user.setAddr(rs.getString("addr"));
				user.setMobile(rs.getString("mobile"));
				list.add(user);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		return list;
	}
	//삭제 메서드
	public boolean deleteUser(int no) {
		
		PreparedStatement pstmt = null;
		boolean flag = false;
		try {
			
			String sql = "delete from userTBL where no=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			int result = pstmt.executeUpdate();
			if(result>0){//삭제성공
				flag = true;
			}
			
			
		} catch (Exception e) {
		
		}finally{
		close(pstmt);
		close(con);
		}
		return flag;
	}
	//수정 메서드
	public boolean updateUser(String addr,int no) {
		boolean flag = false;
		
		PreparedStatement pstmt = null;
		
		try {
			
			String sql = "update usertbl set addr = ? where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setInt(2, no);
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(con);
		}
		return flag;
	}
	//삽입 메서드
	public boolean insertUser(UserVO vo) {
		
		PreparedStatement pstmt = null;
		boolean flag = false;
		
		try {
		
			String sql="insert into usertbl values(usertbl_seq.nextval,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, vo.getUserName());
			pstmt.setInt(2, vo.getBirthYear());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getMobile());
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(con);
		}
		return flag;
	}
	
}


