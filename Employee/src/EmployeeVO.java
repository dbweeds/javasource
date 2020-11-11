
public class EmployeeVO {
	protected String name;
	protected String sex;
	protected String telno;
	protected String birthday;
	protected String address;
	protected String email;
	protected double pay;
	protected String position;
	protected String passward;
	protected static int count;
	
	
	
	@Override
	public String toString() {
		return "EmployeeVO [name=" + name + ", sex=" + sex + ", telno=" + telno + ", birthday=" + birthday
				+ ", address=" + address + ", email=" + email + ", pay=" + pay + ", position=" + position
				+ ", passward=" + passward + "]";
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
		case "주임":
			this.position = position;
			break;
			
		case "대리":
			this.position = position;
			break;
			
		case "과장":
			this.position = position;
			break;
			
		case "차장":
			this.position = position;
			break;
		
		case "부장":
			this.position = position;
			break;
		
		default:
			this.position = "";
		}
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		EmployeeVO.count = count;
	}
}
