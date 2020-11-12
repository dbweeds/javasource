package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

import member.controller.MemberDAO;
import member.domian.MemberVO;

public class MemberAddService {
	public boolean addMember(MemberVO vo) {
		boolean isAddSuccess = false;
		
		//member를 입력하는 입력하는 dao 호출하여 db작업하기
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		int addRsult=dao.memberInsert(vo);
		if(addRsult>0) {
			isAddSuccess = true;
			commit(con);
		}else {
			rollback(con);
		}
		//작업완료후 결과를 action 에 리턴
		close(con);
		
		
		return isAddSuccess;
	}
}
