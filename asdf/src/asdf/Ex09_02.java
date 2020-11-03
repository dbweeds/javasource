package asdf;

import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 ==> ");
		str = s.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) == 'S') || (str.charAt(i) == 's')) 
				System.out.print('$');
			else
				System.out.print(str.charAt(i));
			 
		}

	}

}
