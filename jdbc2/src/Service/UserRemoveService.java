package service;

import static Persistence.JDBCUtil.close;
import static Persistence.JDBCUtil.commit;
import static Persistence.JDBCUtil.getConnection;
import static Persistence.JDBCUtil.rollback;

import java.sql.Connection;

import Domain.UserVO;
import Persistence.UserDAO;

public class UserRemoveService {
	public boolean userRemove(int no) {
		//삭제할 사용자의 번호를 DAO에넘겨 삭제한후 결과 전송받기
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		if(dao.deleteUser(no)) {
			commit(con);
			return true;
		}else {
			rollback(con);
			return false;
		}
	}

}
