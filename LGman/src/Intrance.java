import java.util.Scanner;

public class Intrance {
	Book LGManBook;
	int outloop=0;
	public Intrance(Book book) {
		LGManBook=book;
	}
	public void tryIn() {
		System.out.printf("��� �Է�");
		Scanner s=new Scanner(System.in);
		int temp=s.nextInt();
		if(temp==0) {
			setting();
			
		}
		else {
		System.out.println("�̸��� �Է��ϼ���(���ǿ��� �󱼻���)");
		if (LGManBook.book[temp].name.equals(s.next()))
		System.out.println("ȯ���մϴ� �����ʽÿ�");
		else System.out.println("�߸��� �Է��Դϴ�");}
	}
	public void setting() {
		System.out.printf("1>����ϱ� 2>��������");
		Scanner s=new Scanner(System.in);
		int temp=s.nextInt();
		if(temp==1) {
			System.out.println("���� �����ϴ�");		
		}
		else {
			outloop=1;
			
		}
	}
	public void chageBook(Book newBook) {
		LGManBook=newBook;
		}
}
	

