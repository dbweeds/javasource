package member.action;

import java.util.Scanner;

import member.service.MemberRemoveService;
import member.ui.MemberConsoleUtil;

public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberRemoveService service = new MemberRemoveService();
		if(service.removeMember(console.printMemberRowRemove(sc))) {
			console.preintRemoveSuccessMessage();
		}else {
			console.preintRemoveFailMessage();
		}

	}

}
