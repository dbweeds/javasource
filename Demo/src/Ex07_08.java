import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.print("���� ù ��° �� �Է� : ");
			a = s.nextInt();
			if(a == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("���� �� ��° �� �Է� : ");
			b = s.nextInt();
			
			System.out.printf("%d + %d = %d\n",a,b,a+b);
			
			
		}

	}

}
