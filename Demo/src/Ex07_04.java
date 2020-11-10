import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		String ch;
		
		while(true) {
			System.out.print("첫번째 수를 입력 : ");
			a = s.nextInt();
			System.out.print("두번째 수를 입력 : ");
			b = s.nextInt();
			System.out.print("계산할 연산자 입력(종료할려면 !) : ");
			ch = s.next();
			if(ch.equals("!"))
				break;
			
			switch(ch) {
			case "+":
				System.out.printf("%d + %d = %d 입니다.\n",a,b,a + b);
				break;
			case "-":
				System.out.printf("%d - %d = %d 입니다.\n",a,b,a - b);
				break;
			case "*":
				System.out.printf("%d * %d = %d 입니다.\n",a,b,a * b);
				break;
			case "/":
				System.out.printf("%d / %d = %f 입니다.\n",a,b,a / (float)b);
				break;
			case "%":
				System.out.printf("%d %% %d = %d 입니다.\n",a,b,a % b);
				break;
			default:
				System.out.printf("연산자를 잘못 입력하셨습니다.\n");
				break;
			}
		}
	}

}
