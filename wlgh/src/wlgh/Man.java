package wlgh;

public class Man{
	public int age;
	public String name;
	public Man(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	
	public void showResult() {
		
		System.out.println(age+"\n"+name);}
	}
class Student extends Man{
	public String school;
	
	public Student(String name,int age,String school) {
		super(name,age);
		this.school=school;
		}
	public void showResult() {
		//showResult();
		System.out.println(this.age+"\n"+this.name);
		System.out.println(school);
		
	}
}
class  Worker extends Man{
	public String company;
	public Worker(String name,int age,String company) {
		super(name,age);
		this.company=company;		
	}
	public void showResult() {
		//showResult();
		System.out.println(this.name+"\n"+this.age);
		System.out.println(company);
	}
}
