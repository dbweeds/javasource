package Action;

import java.util.List;
import java.util.Scanner;

import Domain.UserVO;
import Ui.ConsoleUtil;
import service.UserListService;

public class UserListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//USerListService 의 getUserList() 호출해서 결과 전송받기
		UserListService service = new UserListService();
		List<UserVO> userList = service.getUserList();
		
		//받은결과를 ConsoleUtil 로 넘겨서 리스트 출력하기
		ConsoleUtil console = new ConsoleUtil();
		console.printUserList(userList);
	}

}
