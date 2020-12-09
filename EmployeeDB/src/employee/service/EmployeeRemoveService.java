package employee.service;

import static employee.persistence.JDBCUtil.*;

import java.sql.Connection;

import employee.persistence.EmployeeDAO;

public class EmployeeRemoveService {
	public boolean emlpoyeeRemove(int no) {
		Connection con = getConnection();
		EmployeeDAO dao = new EmployeeDAO(con);
		if(dao.employeeRemove(no)>0) {
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
