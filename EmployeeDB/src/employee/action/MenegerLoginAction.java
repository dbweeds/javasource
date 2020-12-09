package employee.action;

import java.util.Scanner;

import employee.domain.EmployeeMenegerVO;
import employee.service.MenegerLoginService;
import employee.ui.ConsoleUtil;

public class MenegerLoginAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loginexcute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		MenegerLoginService service = new MenegerLoginService();
		EmployeeMenegerVO vo=service.menegerLogin(console.loginMenger(sc));
		if(vo.getName() != null) {
			return true;
		}
		return false;
	}
	
}
