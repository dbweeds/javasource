package asdf;

import java.util.Scanner;

public class Ex09_242424 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str ;
		String total = "";
		int diff = 'a' - 'A';
		char ch;
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		for(int i = 0;i < str.length();i++) {
			ch = str.charAt(i);
			if((ch >= 'A') && (ch <= 'Z')) {
				ch += diff;
			}else if((ch >= 'a') && (ch <= 'z')) {
				ch -= diff;
			}
			total += ch;
		}
		System.out.println("��ȯ�� ���ڿ� ==> "+total);
	}

}
