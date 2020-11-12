package Action;

import java.util.Scanner;

import Domain.UserVO;
import Ui.ConsoleUtil;
import service.UserUpdateService;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		//수정할 정보 입력받은 후 서비스에 넘겨서 수정결과 받기
		ConsoleUtil console = new ConsoleUtil();
		UserVO updateUser = console.printUpdateMessage(sc);
		
		
		UserUpdateService service = new UserUpdateService();
		boolean updateSuccess = service.userUpdate(updateUser);
		if(updateSuccess) {
			console.printUpdateSuccessMessage();
		}else {
			console.printUpdateFailMessage();
		}

	}

}
