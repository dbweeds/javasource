package asdf;

import java.util.Scanner;

class MyChar{
	char ch;
}

public class Ex_09009 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MyChar ch1 = new MyChar();
		MyChar ch2 = new MyChar();
		
		System.out.print("���� 1�� �Է� : ");
		ch1.ch = s.next().charAt(0);
		System.out.print("���� 2�� �Է� : ");
		ch2.ch = s.next().charAt(0);
		
		swap(ch1,ch2);
		
		System.out.printf("�ٲ﹮�� ==> %c, %c ",ch1.ch,ch2.ch);
		
	
		
	}

	private static void swap(MyChar ch1, MyChar ch2) {
		char imsi;
		imsi = ch1.ch;
		ch1.ch = ch2.ch;
		ch2.ch = imsi;
		
	}

}
