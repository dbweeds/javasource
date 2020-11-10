import java.util.Scanner;

public class Intrance {
	Book LGManBook;
	int outloop=0;
	public Intrance(Book book) {
		LGManBook=book;
	}
	public void tryIn() {
		System.out.printf("사번 입력");
		Scanner s=new Scanner(System.in);
		int temp=s.nextInt();
		if(temp==0) {
			setting();
			
		}
		else {
		System.out.println("이름을 입력하세요(현실에선 얼굴사진)");
		if (LGManBook.book[temp].name.equals(s.next()))
		System.out.println("환영합니다 들어오십시오");
		else System.out.println("잘못된 입력입니다");}
	}
	public void setting() {
		System.out.printf("1>통과하기 2>전원끄기");
		Scanner s=new Scanner(System.in);
		int temp=s.nextInt();
		if(temp==1) {
			System.out.println("문이 열립니다");		
		}
		else {
			outloop=1;
			
		}
	}
	public void chageBook(Book newBook) {
		LGManBook=newBook;
		}
}
	

