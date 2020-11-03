package asdf;

import java.util.Scanner;

public class Ex_09007 {

	static int diff(char a,char b) {
		int result;
		if(a > b) {
			result = a - b;
		}else if(a < b) {
			result = b - a;
		}else {
			result = 0;
		}	
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char a,b;
		int result;
		
		System.out.print("문자 1을 입력 :");
		a = s.next().charAt(0);
		System.out.print("문자 2을 입력 :");
		b = s.next().charAt(0);
		
		result = diff(a,b);
		System.out.print("두 문자의 차이 ==> "+result);
	}

}
