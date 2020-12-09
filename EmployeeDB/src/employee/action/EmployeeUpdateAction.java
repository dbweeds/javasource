package employee.action;

import java.util.Scanner;

import employee.domain.EmployeeUpdateVO;
import employee.service.EmployeeUpdateService;
import employee.ui.ConsoleUtil;

public class EmployeeUpdateAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		EmployeeUpdateService service = new EmployeeUpdateService();
		if(service.employeeUpdate(console.updateEmployee(sc))) {
			console.preintUpdateSuccessMessage();
		}else {
			console.preintUpdateFailMessage();
		}
	}

	

	@Override
	public boolean loginexcute(Scanner sc) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
