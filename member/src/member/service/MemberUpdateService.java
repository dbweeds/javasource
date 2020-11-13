package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

import member.controller.MemberDAO;
import member.domian.MemberVO;

public class MemberUpdateService {
	public boolean updateService(MemberVO vo) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		if(dao.memberUpdate(vo)>0) {
			commit(con);
			close(con);
			return true;
		}else {
			rollback(con);
			close(con);
			return false;
		}
	}
}
