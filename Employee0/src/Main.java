
public class Main {

	public static void main(String[] args) {
		Date joindate = new Date(2021,4,20);
		RegularEmployee re = new RegularEmployee("김지호","서울시 중랑구","010-3333",joindate,3000000);
		re.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		double salary = re.payCheck();
		System.out.println("급여액 : "+salary + "원");
		
		Employee e = new RegularEmployee("전병선", "서울시", "123-4567",joindate, 10000000);
		e.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		System.out.println("급여액 : "+e.payCheck() + "원");
		
		RegularEmployeeKind a = new RegularEmployeeKind("킴지호", "수원시", "123-4567",joindate,200000);
		a.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		a.setworkDay(30);
		System.out.println("급여액 : "+a.payCheck() + "원");
		
		SalesEmployee b = new SalesEmployee("김사","서울시 면목동","010-3433",joindate,1500000,0.1);
		b.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		b.setSales(50000000);
		System.out.println("급여액 : "+b.payCheck() + "원");
		
		Department dept = new Department();
		dept.setEmployee(re);
		dept.setEmployee(e);
		dept.setEmployee(a);
		dept.setEmployee(b);
		dept.display();
		
		
		RegularEmployee re2 = new RegularEmployee("김지호","서울시 중랑구","010-3333",joindate,3000000);
		re.displayEmployee();
		System.out.println();
		re2.displayEmployee();
		System.out.println();
		
		if(re == re2)
			System.out.println("==");
		else
			System.out.println("!=");
		
		if(re.equals(re2))
			System.out.println("==");
		else
			System.out.println("!=");
	}

}
