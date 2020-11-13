package member.action;

import java.util.Scanner;

import member.domian.MemberVO;
import member.service.MemberUpdateService;
import member.ui.MemberConsoleUtil;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberVO vo = console.printMemberUpdate(sc);
		MemberUpdateService service = new MemberUpdateService();
		if(service.updateService(vo)) {
			console.preintUpdateSuccessMessage();
		}else {
			console.preintUpdateFailMessage();
		}

	}

}
