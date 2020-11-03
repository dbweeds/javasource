package department;
import Employee.Employee;

public class Department {
	private Employee employee[];
	private int headCount;
	
	public Department(){
		employee = new Employee[5];
		headCount = 0;
	}
	
	public void setEmployee(Employee e) {
		if(headCount <employee.length) {
			employee[headCount] = e;
			headCount++;
		}
	}
	
	public void display() {
		for(int i = 0;i < headCount;i++) {
			employee[i].displayEmployee();
			System.out.println();
			System.out.println("급여액은 "+employee[i].payCheck()+"입니다.");
		}
	}
}
