package Employee;
import date.Date;

public class Employee {
	private String name;
	private String address;
	private String telno;
	private Date joindate;
	public static int count = 0;
	
	public Employee(String name,String address,String telno,Date joindate) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.joindate = joindate;
		count++;
	}
	
	public void displayEmployee() {
		System.out.printf("사원명 : %s, 주소 : %s,전화번호 : %s,입사일 : %s",name,address,telno,joindate);
	}
	public double payCheck() {
		return 0;
	}	
	
	@Override
	public boolean equals(Object obj) {
	Employee e = (Employee)obj;
	
		return (this.name == e.name && 
				this.address == e.address && 
				this.telno == e.telno && 
				this.joindate == e.joindate);
	}
}
