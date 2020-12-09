package employee.service;

import static employee.persistence.JDBCUtil.*;

import java.sql.Connection;

import employee.domain.EmployeeMenegerVO;
import employee.persistence.EmployeeDAO;

public class MenegerLoginService {
	public EmployeeMenegerVO menegerLogin(EmployeeMenegerVO vo) {
		Connection con = getConnection();
		EmployeeDAO dao = new EmployeeDAO(con);
		return dao.employeeMenegerLogin(vo);
	}
}
