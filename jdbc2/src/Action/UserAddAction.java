package Action;

import java.util.Scanner;

import Domain.UserVO;
import Ui.ConsoleUtil;
import service.UserAddService;

public class UserAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil console = new ConsoleUtil();
		
		//추가할 회원정보 가져오기
		UserVO user = console.getNewUser(sc);
		
		//회원정보 Service 객체에 넘기기
		UserAddService service = new UserAddService();
		boolean isAddSuccess = service.addUser(user);
		
		//실행결과에따라 결과 메시지 출력
		if(isAddSuccess) {
			console.printAddSuccessMessage(user);
		}else {
			console.printAddFailMessage(user);
		}
	}

}
