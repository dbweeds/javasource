public class Department {
	private Employee[] employees;
	private int headCount;
	
	public Department() {
		employees = new Employee[5];
		headCount = 0;
	}

	public void setEmployee(Employee e) {
		if(headCount < employees.length)
			employees[headCount++] = e;
	}
	
	public void display() {
		for (int i =0;i < headCount; i++) {
			employees[i].displayEmployee();
			System.out.println("급여액 : "+employees[i].payCheck() + "원");
		}
	}
}
