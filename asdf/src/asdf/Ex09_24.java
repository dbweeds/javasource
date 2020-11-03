package asdf;

import java.util.Scanner;

public class Ex09_24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		String ch = "";
		
		System.out.print("문자열을 입력하세요 : ");
		str = s.nextLine();
		System.out.print("변환된 문자열 : ");
		for(int i = 0;i < str.length();i++) { 
			ch += str.charAt(i);
			if((str.charAt(i) >= 'a')&&(str.charAt(i) <= 'z')) {
				System.out.print(ch.toUpperCase());
			}else if((str.charAt(i) >= 'A')&&(str.charAt(i) <= 'Z')) {
				System.out.print(ch.toLowerCase());
			}else {
				System.out.print(ch);
			}
			ch = "";
		}
	}

}
