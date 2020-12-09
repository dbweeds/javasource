package employee.domain;

public class EmployeeVO {	
	protected int no;
	protected String name;
	protected String sex;
	protected String telno;
	protected String birthday;
	protected String address;
	protected String email;
	protected int pay;
	protected String position;
	protected String id;
	protected String passward;
	
	
	public EmployeeVO() {
		
	}
	public EmployeeVO(int no, String name, String sex, String telno, String birthday, String address, String email,
			int pay, String position, String id, String passward) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.telno = telno;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.pay = pay;
		this.position = position;
		this.id = id;
		this.passward = passward;
	}
	public EmployeeVO(String name, String sex, String telno, String birthday, String address, String email,
			int pay, String position, String id, String passward) {
		super();
		this.name = name;
		this.sex = sex;
		this.telno = telno;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.pay = pay;
		this.position = position;
		this.id = id;
		this.passward = passward;
	}
	@Override
	public String toString() {
		return "EmployeeVO [no=" + no + ", name=" + name + ", sex=" + sex + ", telno=" + telno + ", birthday="
				+ birthday + ", address=" + address + ", email=" + email + ", pay=" + pay + ", position=" + position
				+ ", id=" + id + ", passward=" + passward + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getno() {
		return no;
	}
	public void setno(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
}
