package member.action;

import java.util.List;
import java.util.Scanner;

import member.domian.MemberVO;
import member.service.MemberSelectService;
import member.ui.MemberConsoleUtil;

public class MemberSelectAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 사용자로부터 입력받기 - MemberConsoleUtil 의 getAddMember()
		//입력받은 객체를 Service 로 넘겨서 db처리를 한 후 결과를전송받아
		//성공한경우 메세지출력 - MemberConsoleUtil 의 printAddSuccessMessage()
		
		MemberSelectService service = new MemberSelectService();
		List<MemberVO> list = service.selectMember();
		MemberConsoleUtil console = new MemberConsoleUtil();
		console.preintMemberList(list);
	}

}
