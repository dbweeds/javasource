import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int guess=32;
		int value;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		do {
			value = s.nextInt();
			
			if(value > guess) {
				System.out.println("�������� �Է��ϼ���");
			}else if(value < guess) {
				System.out.println("ū���� �Է��ϼ���");
		}
		}while(value != guess);
		System.out.println("�����Դϴ�.");

	}

}
