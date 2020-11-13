package member.action;

import java.util.Scanner;

import member.domian.MemberVO;
import member.service.MemberSearchService;
import member.ui.MemberConsoleUtil;

public class MemberSearchAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberSearchService service = new MemberSearchService();
		MemberVO vo =service.meberSerch(console.printMemberRowRemove(sc));
		console.preintMemberSearch(vo);

	}

}
