import java.util.Scanner;

public class Book {
	LGMan[] book;
	int numOfEmployee;
	public Book() {
		System.out.println("몇명의 직원이 있나요");
		Scanner s=new Scanner(System.in);
		numOfEmployee=s.nextInt();
		book=new LGMan[numOfEmployee];
		for(int i=0;i<numOfEmployee;i++) {
			book[i]=new LGMan();
		}
	
	}
	public void setAllEmployee() {
		System.out.println("관리자 입력");
		book[0].setInfo(0);
		book[0].CID=0;
		for(int i=1;i<numOfEmployee;i++) {
			book[i].setInfo(i);
		}
	}
	public void setOneEmployee() {
		System.out.print("바꿀 사람 사번");
		int temp=new Scanner(System.in).nextInt();
		book[temp].setInfo();
	}
	public void showInfo() {
		System.out.print("보고싶은 사람 사번 입력");
		int i=new Scanner(System.in).nextInt();
		book[i].showInfo();
	}
	public LGMan getInfo(int num) {
	return book[num];
	}
}
