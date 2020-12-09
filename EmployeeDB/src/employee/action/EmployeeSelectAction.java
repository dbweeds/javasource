package employee.action;

import java.util.List;
import java.util.Scanner;

import employee.domain.EmployeeVO;
import employee.service.EmployeeSelectService;
import employee.ui.ConsoleUtil;

public class EmployeeSelectAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		EmployeeSelectService service = new EmployeeSelectService();
		List<EmployeeVO> list = service.employeeSelect();
		ConsoleUtil console = new ConsoleUtil();
		console.printEmlpoyeeList(list);
	}

	@Override
	public boolean loginexcute(Scanner sc) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
