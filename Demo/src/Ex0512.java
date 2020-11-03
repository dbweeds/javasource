import java.util.Scanner;

public class Ex0512 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		char c;
		
		System.out.print("첫번째 수를 입력하세요 : ");
		a = s.nextInt();
		
		System.out.print("계산할 연산자를 입력하세요 : ");
		c = s.next().charAt(0);
		
		System.out.print("두번째 수를 입력하세요 : ");
		b = s.nextInt();
		
		if(c == '+')
			System.out.printf("%d %c %d = %d 입니다.",a,c,b,a+b);
		else if(c == '-')
			System.out.printf("%d %c %d = %d 입니다.",a,c,b,a-b);
		else if(c == '*')
			System.out.printf("%d %c %d = %d 입니다.",a,c,b,a*b);	
		else if(c == '/')
			System.out.printf("%d %c %d = %f 입니다.",a,c,b,(double)a/b);
		else if(c == '%')
			System.out.printf("%d %c %d = %d 입니다.",a,c,b,a%b);
		else
			System.out.printf("연산자를 잘못 입력하셨습니다.");
	}

}
