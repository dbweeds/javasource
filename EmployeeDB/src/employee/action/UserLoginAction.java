package employee.action;

import java.util.Scanner;

import employee.domain.EmployeeVO;
import employee.service.UserLoginService;
import employee.ui.ConsoleUtil;

public class UserLoginAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean loginexcute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		UserLoginService service = new UserLoginService();
		EmployeeVO vo=service.UserLogin(console.loginUser(sc));
		if(vo.getName() !=null) {
			return true;
		}else {
			return false;
		}
	}

}
