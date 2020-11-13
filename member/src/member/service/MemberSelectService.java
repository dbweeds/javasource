package member.service;

import java.sql.Connection;
import java.util.List;

import member.controller.MemberDAO;
import member.domian.MemberVO;
import static member.persistence.JDBCUtil.*;

public class MemberSelectService {
	//member를 입력하는 입력하는 dao 호출하여 db작업하기
	public List<MemberVO> selectMember() {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		List<MemberVO> list = dao.memberList();
		close(con);
		return list;
	}
	
	
	//작업완료후 결과를 action 에 리턴
}
