package Action;

import java.util.Scanner;

import Domain.UserVO;
import Ui.ConsoleUtil;
import service.UserRowService;

public class UserRowAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//조회할 사용자의 번호를 입력받아 Service 객체에게 넘겨주기
		ConsoleUtil console = new ConsoleUtil();
		int no = console.printUserRow(sc);
		
		UserRowService service = new UserRowService();
		UserVO user = service.getUserRow(no);
		
		console.printUserDetail(user);
	}

}
