package Employee;
import date.Date;

public class RegularEmployee extends Employee {
	protected double salary;
	
	
	public RegularEmployee(String name, String address,String telno, Date joindate, double salary) {
		super (name,address,telno,joindate);
		this.salary = salary;
		count++;
	}
	
	public double payCheck() {
		return salary;
	}

	
	
}
