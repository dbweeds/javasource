package Service;

import static Persistence.JDBCUtil.*;

import java.sql.Connection;
import java.util.List;

import Domain.UserVO;
import Persistence.UserDAO;

public class UserListService {
	//dao.getList() 결과를 받아서 UserListAction 넘기기
	public List<UserVO> getUserList() {
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		List<UserVO> list = dao.getList();
		
		close(con);
		
		return list; 
	}
}
