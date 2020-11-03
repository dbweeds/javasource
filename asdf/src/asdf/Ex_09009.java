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
		
		System.out.print("문자 1을 입력 : ");
		ch1.ch = s.next().charAt(0);
		System.out.print("문자 2을 입력 : ");
		ch2.ch = s.next().charAt(0);
		
		swap(ch1,ch2);
		
		System.out.printf("바뀐문자 ==> %c, %c ",ch1.ch,ch2.ch);
		
	
		
	}

	private static void swap(MyChar ch1, MyChar ch2) {
		char imsi;
		imsi = ch1.ch;
		ch1.ch = ch2.ch;
		ch2.ch = imsi;
		
	}

}
