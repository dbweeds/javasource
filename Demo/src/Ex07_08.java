import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.print("더할 첫 번째 수 입력 : ");
			a = s.nextInt();
			if(a == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("더할 두 번째 수 입력 : ");
			b = s.nextInt();
			
			System.out.printf("%d + %d = %d\n",a,b,a+b);
			
			
		}

	}

}
