package asdf;

import java.util.Scanner;

public class Ex09_2424 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		String out = "";	
		int diff = 'a' - 'A';
		
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		System.out.print("��ȯ�� ���ڿ� : ");
		
		for(int i = 0; i <str.length();i++) {
			if (('A' <= str.charAt(i)) && ('Z' >= str.charAt(i))) {
				out += (char)(str.charAt(i)+diff);
			}
			else if (('a' <= str.charAt(i)) && ('z' >= str.charAt(i))) {
				out += (char)(str.charAt(i)-diff);
			}else {
				out += str.charAt(i);
			}
		}
		System.out.print(out);
	}
}
