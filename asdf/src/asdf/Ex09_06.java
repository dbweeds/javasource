package asdf;

import java.util.Scanner;

public class Ex09_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 ==> ");
		str = s.nextLine();
		
		System.out.println("[" + str + "]");
		
		System.out.println("[" + str.toUpperCase() + "]");
		
		System.out.println("[" + str.toLowerCase() + "]");
		
		System.out.println("[" + str.trim() + "]");
		
		

	}

}
