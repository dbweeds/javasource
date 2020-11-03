
public class Employee {
	private String name;
	private String sex;
	private String empNumber;
	private String telno;
	private String birthday;
	private String address;
	private String email;
	private double pay;
	private String position;
	private String passward;
	private static int count;
	
	public static int getCount() {
		return count;
	}


	public static void setCount() {
		++Employee.count;
	}


	public String getPassward() {
		return passward;
	}


	public Employee() {
		name = " ";
		sex = " ";
		empNumber = " ";
		email = " ";
		birthday = "";
		telno = "000-0000-0000";
		address = "not address";
		pay = 0.0;
		position = " ";
		
	}

	
	public void setPassward(String passward) {
		this.passward = passward;
	}


	public void displayAllEmployee() {
		System.out.printf("�̸� : %s, ���� : %s, �����ȣ : %s, ���� : %s,�̸��� : %s, ������� : %s ��ȭ��ȣ : %s, �ּ� : %s, �޿� : %f\n",  
						  name, sex, empNumber, position,email, birthday, telno, address, pay);
		
	}
	public void displayBasicEmployee() {
		System.out.printf("�̸� : %s, ���� : %s, �����ȣ : %s, ���� : %s,�̸��� : %s, ������� : %s ��ȭ��ȣ : %s, �ּ� : %s\n",  
						  name, sex, empNumber, position,email, birthday, telno, address);
		
	}
	
	public double realPay() {
		return ((pay - ((pay*0.033)+(pay*0.045)+(pay*0.008)))/12);
	}
	
	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		switch(position) {
		case "����":
			this.position = position;
			break;
			
		case "�븮":
			this.position = position;
			break;
			
		case "����":
			this.position = position;
			break;
			
		case "����":
			this.position = position;
			break;
		
		case "����":
			this.position = position;
			break;
		
		default:
			this.position = "";
		}
		
		
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getEmail() {
		return email;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
	