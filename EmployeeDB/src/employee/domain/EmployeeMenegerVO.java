package employee.domain;

public class EmployeeMenegerVO {
	protected String id;
	protected String name;
	protected String passward;
	
	
	@Override
	public String toString() {
		return "EmployeeMenegerVO [id=" + id + ", name=" + name + ", passward=" + passward + "]";
	}
	public EmployeeMenegerVO() {
		
	}
	
	public EmployeeMenegerVO(String id, String name, String passward) {
		super();
		this.id = id;
		this.name = name;
		this.passward = passward;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
}
