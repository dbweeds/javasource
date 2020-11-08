package Ex2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		String str;
		int result = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("영어단어 입력 : ");
		str = s.nextLine();
		for(int i = 0; i < str.length();i++) {
			if((str.charAt(i)>='a')&&(str.charAt(i)<='z'))
				result += (str.charAt(i)-'a'+1);
			else if((str.charAt(i)>='A')&&(str.charAt(i)<='Z'))
				result += (str.charAt(i)-'A'+1);
		}
		System.out.println("SUM = "+result);
			

	}

}
