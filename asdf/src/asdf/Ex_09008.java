package asdf;

import java.util.Scanner;

class MyChar{
	char ch;
}

public class Ex_09008 {

	static int diff(MyChar a,MyChar b) {
		if(a.ch > b.ch) {
			return a.ch - b.ch;
		}else if(a.ch < b.ch) {
			return b.ch - a.ch;
		}else {
			return 0;
		}	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MyChar ch1 = new MyChar();
		MyChar ch2 = new MyChar();
		
		System.out.print("���� 1�� �Է� :");
		ch1.ch = s.next().charAt(0);
		System.out.print("���� 2�� �Է� :");
		ch2.ch = s.next().charAt(0);
		
		System.out.print("�� ������ ���� ==> "+(diff(ch1, ch2)));
	}

}
