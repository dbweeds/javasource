package employee.action;

import java.util.Scanner;

import employee.domain.EmployeeVO;
import employee.service.EmployeeAddService;
import employee.ui.ConsoleUtil;

public class EmployeeAddAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		EmployeeVO vo =console.addEmployee(sc); 
		
		EmployeeAddService service = new EmployeeAddService();
		if(service.addEmployee(vo)) {
			console.addEmployeeSuccessMessage();
		}else {
			console.addEmployeeFailMessage();
		}
	}

	@Override
	public boolean loginexcute(Scanner sc) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
