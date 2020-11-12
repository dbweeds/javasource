package service;

import static Persistence.JDBCUtil.*;

import java.sql.Connection;

import Domain.UserVO;
import Persistence.UserDAO;


public class UserRowService {
	public UserVO getUserRow(int no) {
		Connection con = getConnection();
		//UserDAO getRow() 호출하여 결과 전송받기
		UserDAO dao = new UserDAO(con);
		UserVO vo = dao.getRow(no);
		
		close(con);
		//전송받은 경과를 UserRowAction 넘겨주기
		return vo;
	}

}
