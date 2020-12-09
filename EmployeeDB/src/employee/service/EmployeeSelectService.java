package employee.service;

import java.sql.Connection;
import java.util.List;

import employee.domain.EmployeeVO;
import employee.persistence.EmployeeDAO;

import static employee.persistence.JDBCUtil.*;
public class EmployeeSelectService {
	public List<EmployeeVO> employeeSelect(){
		Connection con = getConnection();
		EmployeeDAO dao = new EmployeeDAO(con);
		List<EmployeeVO> list = dao.employeeList();
		close(con);
		return list;
	}

}
