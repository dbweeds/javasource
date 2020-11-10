import java.util.Scanner;

public class Ex05_13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String a, b, c;
		int a1,b1;
		System.out.print("수식을 한줄로 띄어쓰기로 입력하세요 : ");
		a = s.next();
		a1 = Integer.parseInt(a);
		c = s.next();
		b = s.next();
		b1 = Integer.parseInt(b);
		switch(c) {
		case "+":
			System.out.printf("%d %s %d = %d",a1,c,b1,a1+b1);
			break;
		case "-":
			System.out.printf("%d %s %d = %d",a1,c,b1,a1-b1);
			break;
		case "*":
			System.out.printf("%d %s %d = %d",a1,c,b1,a1*b1);
			break;
		case "/":
			System.out.printf("%d %s %d = %d",a1,c,b1,a1/b1);
			break;
		case "%":
			System.out.printf("%d %s %d = %d",a1,c,b1,a1%b1);
			break;
		default:
			System.out.printf("수식을 잘못입력했습니다.");
		
		}
	}

}
