package employee.service;

import java.sql.Connection;

import employee.domain.EmployeeVO;
import employee.persistence.EmployeeDAO;

import static employee.persistence.JDBCUtil.*;
public class UserLoginService {
	public EmployeeVO UserLogin(EmployeeVO vo) {
		Connection con=getConnection();
		EmployeeDAO dao = new EmployeeDAO(con);
		return dao.employeeUserLogin(vo);
	}
}
