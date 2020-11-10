
public class RegularEmployeeKind extends Employee {
	private double payDay;
	private double workDay;
	
	public RegularEmployeeKind(String name, String address,String telno, Date joindate,double payDay) {
		super(name,address,telno,joindate);
		this.payDay = payDay;
		this.workDay = 0;
	}
	public void setworkDay(double workDay) {
		this.workDay = workDay;
	}
	
	
	public double payCheck() {
		return payDay*workDay;
	}
}
