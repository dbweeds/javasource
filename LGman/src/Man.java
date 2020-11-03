import java.util.Scanner;

public class Man {
	String name;
	int age;
	Long phone;
	Long PID;
	public Man(String name,int age,Long phone ,Long PID){
		this.name=name;this.age=age;this.phone=phone;this.PID=PID;
	}
	public Man() {
	}
	
	public void setInfo() {
		Scanner s=new Scanner(System.in);
		System.out.print("이름:");
		name=s.next();
		System.out.print("나이:");
		age=s.nextInt();
		System.out.print("전번:");
		phone=s.nextLong();
		System.out.print("주번");
		PID=s.nextLong();
	}
	public void showInfo() {
		System.out.printf("%s\n%d\n%d\n%d",name,age,phone,PID);
	}
	}

class LGMan extends Man{
	int CID;
	public LGMan() {
		super();
		//Scanner s=new Scanner(System.in);
		//System.out.print("사번");
		//CID=s.nextInt();
	}
	public LGMan(String name,int age,Long phone,Long PID,int CID) {
		super(name,age, phone, PID);
		this.CID=CID;	
	}
	public void setInfo() {
		super.setInfo();
		System.out.print("사번");
		Scanner s=new Scanner(System.in);
		CID=s.nextInt();
	}
	public void setInfo(int a) {Scanner s=new Scanner(System.in);
		if(a==0) {
			System.out.println("관리자님의 사번은 0번입니다. 기타 정보를 입력해주셍");
			System.out.print("이름 을 입력해주세요");
			this.name=s.next();
			System.out.print("나이");
			this.age=s.nextInt();
			System.out.print("주민번호");
			this.PID=s.nextLong();
			System.out.print("전번");
			this.phone=s.nextLong();
		}
		else {
		System.out.println("사번"+a+"님의 정보 입력");
		super.setInfo();}
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(CID);
	}
	
}