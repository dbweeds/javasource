import java.util.Scanner;

public class Ex07_18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int upperCnt=0;
		int lowerCnt=0;
		int digitCnt=0;
		int i = 0;
		
		System.out.print("���ڿ��� �Է� : ");
		str = s.nextLine();
		
		while(i < str.length()) {
			ch = str.charAt(i);
			
			if ((ch >= 'A')&&(ch <= 'Z')) 
				upperCnt++;
			if ((ch >= 'a')&&(ch <= 'z')) 
				lowerCnt++;
			if ((ch >= '0')&&(ch <= '9')) 
				digitCnt++;
			i++;
		}
		System.out.printf("�빮��%d��, �ҹ���%d��, ����%d��",upperCnt,lowerCnt,digitCnt);
		
	}

}
