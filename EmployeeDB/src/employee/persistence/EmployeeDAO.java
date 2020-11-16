package employee.persistence;

import static employee.persistence.JDBCUtil.close;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import employee.domain.EmployeeVO;
public class EmployeeDAO {
	Connection con;
	public EmployeeDAO(Connection con) {
		this.con = con;
	}
	
	public int employeeInsert(EmployeeVO vo) {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "insert into employee values(employee_seq.nextval,?,?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getSex());
			pstmt.setString(3, vo.getTelno());
			pstmt.setString(4, vo.getBirthday());
			pstmt.setString(5, vo.getAddress());
			pstmt.setString(6, vo.getEmail());
			pstmt.setInt(7, vo.getPay());
			pstmt.setString(8, vo.getPosition());
			pstmt.setString(8, vo.getId());
			pstmt.setString(9, vo.getPassward());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public EmployeeVO employeeSelect(int no) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO vo = null;
		try {
			String sql = "select * from employee where no = ?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int no1 = rs.getInt("no");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String telno = rs.getString("telno");
				String birthday = rs.getString("birthday");
				String address = rs.getString("address");
				String email = rs.getString("email");
				int pay = rs.getInt("pay");
				String position = rs.getString("position");
				String id = rs.getString("id");
				String passward = rs.getString("passward");
				vo = new EmployeeVO(no1,name,sex,telno,birthday,address,email,pay,position,id,passward);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		return vo;
	}
	public List<EmployeeVO> employeeList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		try {
			String sql = "select * from employee";
			pstmt=con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String telno = rs.getString("telno");
				String birthday = rs.getString("birthday");
				String address = rs.getString("address");
				String email = rs.getString("email");
				int pay = rs.getInt("pay");
				String position = rs.getString("position");
				String id = rs.getString("id");
				String passward = rs.getString("passward");
				list.add(new EmployeeVO(no,name,sex,telno,birthday,address,email,pay,position,id,passward));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		return list;
	}
	public int employeeUpdate(String want,String answer,EmployeeVO vo) {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "update employee set ? = ? where no = ?";
			pstmt.setString(1, want);
			pstmt.setString(2, answer);
			pstmt.setInt(3, vo.getno());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;		
	}
	public int employeeRemove(int no) {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "delete from employee where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
}
