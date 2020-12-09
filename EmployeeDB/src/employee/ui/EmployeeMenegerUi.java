package employee.ui;

import java.util.Scanner;

import employee.action.Action;
import employee.action.EmployeeAddAction;
import employee.action.EmployeeRemoveAction;
import employee.action.EmployeeSelectAction;
import employee.action.EmployeeUpdateAction;
import employee.action.MenegerLoginAction;
import employee.controller.EmployeeController;

public class EmployeeMenegerUi {
	public void EmployeeMeneger(Scanner sc) throws Exception {
		boolean isStop = false;
		EmployeeController controller = new EmployeeController();
		Action action = null;
		
		action = new MenegerLoginAction();
		
		
		if(action.loginexcute(sc)) {
		do {
			System.out.println("******* Meneger 프로그램 *******");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록 보기");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원정보 삭제");
			System.out.println("5. Main");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				action = new EmployeeAddAction();
				break;
			case 2:
				action = new EmployeeSelectAction();
				break;
			case 3:
				action = new EmployeeUpdateAction();
				break;
			case 4:
				action = new EmployeeRemoveAction();
				break;
			case 5:
				isStop = true;
				break;
			default:
				break;
			}
			if(action != null) {
				controller.processRequest(action, sc);
			}
		}while(!isStop);
	}
	}
}
