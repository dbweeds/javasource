import java.util.Scanner;

public class Ex06_016 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		while(true) {		
		System.out.print("���ڸ� �Է� : ");
		str = s.nextLine();
		
		System.out.printf("�Է��� ���ڿ� ==> %s\n",str);
		System.out.printf("��ȯ�� ���ڿ� ==> ");
		
		for(int i =str.length() -1;i >= 0; i-- ) {
			System.out.printf("%c",str.charAt(i));
		}System.out.println();
		}

	}

}
