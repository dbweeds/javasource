package asdf;

import java.util.Scanner;

public class Ex09_23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		System.out.print("������ �Ųٷ� ��� ==> ");
		for(int i = str.length()-1;i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		

	}

}
