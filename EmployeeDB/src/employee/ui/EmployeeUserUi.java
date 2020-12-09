package employee.ui;

import java.util.Scanner;

import employee.action.Action;
import employee.action.UserLoginAction;
import employee.controller.EmployeeController;

public class EmployeeUserUi {
	public void EmployeeUser(Scanner sc) throws Exception {
		boolean isStop = false;
		EmployeeController controller = new EmployeeController();
		Action action = null;
		
		action = new UserLoginAction();
		
		if(action.loginexcute(sc)) {
			do {
				System.out.println("******* User 프로그램 *******");
				System.out.println("1. 본인개인정보 보기");
				System.out.println("2. 본인개인정보 수정");
				System.out.println("3. Main");
				int menu = sc.nextInt();
				
				switch(menu) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					isStop = true;
					break;
				default:
					break;
				}
				if(action !=null) {
					controller.processRequest(action, sc);
				}
			}while(!isStop);
		}
	}
}
