package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

import member.controller.MemberDAO;
import member.domian.MemberVO;
public class MemberSearchService {
	public MemberVO meberSerch(int id) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		return dao.memberSearch(id);
	}
}
