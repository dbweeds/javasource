import java.util.Scanner;

public class Book {
	LGMan[] book;
	int numOfEmployee;
	public Book() {
		System.out.println("����� ������ �ֳ���");
		Scanner s=new Scanner(System.in);
		numOfEmployee=s.nextInt();
		book=new LGMan[numOfEmployee];
		for(int i=0;i<numOfEmployee;i++) {
			book[i]=new LGMan();
		}
	
	}
	public void setAllEmployee() {
		System.out.println("������ �Է�");
		book[0].setInfo(0);
		book[0].CID=0;
		for(int i=1;i<numOfEmployee;i++) {
			book[i].setInfo(i);
		}
	}
	public void setOneEmployee() {
		System.out.print("�ٲ� ��� ���");
		int temp=new Scanner(System.in).nextInt();
		book[temp].setInfo();
	}
	public void showInfo() {
		System.out.print("������� ��� ��� �Է�");
		int i=new Scanner(System.in).nextInt();
		book[i].showInfo();
	}
	public LGMan getInfo(int num) {
	return book[num];
	}
}
