package member.action;

import java.util.Scanner;

import member.domian.MemberVO;
import member.service.MemberAddService;
import member.ui.MemberConsoleUtil;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 사용자로부터 입력받기 - MemberConsoleUtil 의 getAddMember()
		//입력받은 객체를 Service 로 넘겨서 db처리를 한 후 결과를전송받아
		//성공한경우 메세지출력 - MemberConsoleUtil 의 printAddSuccessMessage()
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberVO vo = console.getNewMember(sc);
		
		MemberAddService service = new MemberAddService();
		if(service.addMember(vo)) {
			console.preintAddSuccessMessage(vo.getName());
		}
		

	}

}
