package service;

import static Persistence.JDBCUtil.close;
import static Persistence.JDBCUtil.commit;
import static Persistence.JDBCUtil.getConnection;
import static Persistence.JDBCUtil.rollback;

import java.sql.Connection;

import Domain.UserVO;
import Persistence.UserDAO;

public class UserAddService {
	public boolean addUser(UserVO vo) throws Exception{
		boolean isInsertSuccess = false;
		//DAO작업
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		if(dao.insertUser(vo)) {
			commit(con);
			isInsertSuccess = true;
		}else {
			rollback(con);
		}
		
		close(con);
		
		return isInsertSuccess;
	}
}
