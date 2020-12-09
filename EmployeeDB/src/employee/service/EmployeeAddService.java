package employee.service;

import java.sql.Connection;

import employee.domain.EmployeeVO;
import employee.persistence.EmployeeDAO;

import static employee.persistence.JDBCUtil.*;
public class EmployeeAddService {
	public boolean addEmployee(EmployeeVO vo) {
		Connection con = getConnection();
		EmployeeDAO dao = new EmployeeDAO(con);
		if(dao.employeeInsert(vo)>0) {
			commit(con);
			close(con);
			return true;
		}else {
			rollback(con);
			close(con);
			return false;
		}
	}
}
