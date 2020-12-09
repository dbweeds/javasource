package employee.service;

import static employee.persistence.JDBCUtil.*;

import java.sql.Connection;

import employee.domain.EmployeeUpdateVO;
import employee.persistence.EmployeeDAO;
public class EmployeeUpdateService {
	public boolean employeeUpdate(EmployeeUpdateVO vo) {
		Connection con = getConnection();
		EmployeeDAO dao = new EmployeeDAO(con);
		int result=dao.employeeUpdate(vo);
		if(result>0) {
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
