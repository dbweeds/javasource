package asdf;

import java.util.Scanner;

public class Ex09_2323 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		System.out.print("문자열을 입력하세요 : ");
		str = s.nextLine();
		
		System.out.print("내용을 거꾸로 입력 ==> ");
		for(int i = str.length()-1;i >= 0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
