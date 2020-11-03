package asdf;

import java.util.Scanner;

public class Ex09_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str,total;
		total = "";
		
		System.out.print("문자열 입력 ==> ");
		str = s.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i) != '	')) {
				total += str.charAt(i);
			}
		}
		System.out.println("["+str+"]");
		System.out.println("["+total+"]");
		

	}

}
