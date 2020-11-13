package member.service;

import java.sql.Connection;

import member.controller.MemberDAO;

import static member.persistence.JDBCUtil.*;

public class MemberRemoveService {
	public boolean removeMember(int id) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		if(dao.memberRemove(id)>0) {
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
