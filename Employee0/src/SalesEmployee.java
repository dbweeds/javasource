
public class SalesEmployee extends RegularEmployee {
	private double rate;
	private double sales;
	public SalesEmployee(String name, String address, String telno, Date joindate, double salary,double rate) {
		super(name, address, telno, joindate, salary);
		this.rate = rate;
		this.sales = 0;
	}
	
	public void setSales(double sales) {
		this.sales = sales;
	}
	
	public double payCheck() {
		return super.salary +(sales*rate);
	}
}
