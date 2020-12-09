package employee.action;

import java.util.Scanner;

import employee.service.EmployeeRemoveService;
import employee.ui.ConsoleUtil;

public class EmployeeRemoveAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		EmployeeRemoveService service = new EmployeeRemoveService();
		if(service.emlpoyeeRemove(console.printEmployeeRemove(sc))) {
			console.preintRemoveSuccessMessage();
		}else {
			console.preintRemoveFailMessage();
		}

	}

	@Override
	public boolean loginexcute(Scanner sc) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
