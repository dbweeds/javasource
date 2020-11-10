
public class Main {

	public static void main(String[] args) {
		Date joindate = new Date(2021,4,20);
		RegularEmployee re = new RegularEmployee("����ȣ","����� �߶���","010-3333",joindate,3000000);
		re.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		double salary = re.payCheck();
		System.out.println("�޿��� : "+salary + "��");
		
		Employee e = new RegularEmployee("������", "�����", "123-4567",joindate, 10000000);
		e.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		System.out.println("�޿��� : "+e.payCheck() + "��");
		
		RegularEmployeeKind a = new RegularEmployeeKind("Ŵ��ȣ", "������", "123-4567",joindate,200000);
		a.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		a.setworkDay(30);
		System.out.println("�޿��� : "+a.payCheck() + "��");
		
		SalesEmployee b = new SalesEmployee("���","����� ���","010-3433",joindate,1500000,0.1);
		b.displayEmployee();
		System.out.println();
		System.out.println(Employee.count);
		b.setSales(50000000);
		System.out.println("�޿��� : "+b.payCheck() + "��");
		
		Department dept = new Department();
		dept.setEmployee(re);
		dept.setEmployee(e);
		dept.setEmployee(a);
		dept.setEmployee(b);
		dept.display();
		
		
		RegularEmployee re2 = new RegularEmployee("����ȣ","����� �߶���","010-3333",joindate,3000000);
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
