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
		System.out.print("�̸�:");
		name=s.next();
		System.out.print("����:");
		age=s.nextInt();
		System.out.print("����:");
		phone=s.nextLong();
		System.out.print("�ֹ�");
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
		//System.out.print("���");
		//CID=s.nextInt();
	}
	public LGMan(String name,int age,Long phone,Long PID,int CID) {
		super(name,age, phone, PID);
		this.CID=CID;	
	}
	public void setInfo() {
		super.setInfo();
		System.out.print("���");
		Scanner s=new Scanner(System.in);
		CID=s.nextInt();
	}
	public void setInfo(int a) {Scanner s=new Scanner(System.in);
		if(a==0) {
			System.out.println("�����ڴ��� ����� 0���Դϴ�. ��Ÿ ������ �Է����ּ�");
			System.out.print("�̸� �� �Է����ּ���");
			this.name=s.next();
			System.out.print("����");
			this.age=s.nextInt();
			System.out.print("�ֹι�ȣ");
			this.PID=s.nextLong();
			System.out.print("����");
			this.phone=s.nextLong();
		}
		else {
		System.out.println("���"+a+"���� ���� �Է�");
		super.setInfo();}
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(CID);
	}
	
}