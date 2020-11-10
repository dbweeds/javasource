import java.util.Scanner;

public class Ex05_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double first,second;
		char c;
		double result = 0;
		boolean a =true;
		
		System.out.printf("첫번째 수를 입력하세요 : ");
		first = s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요 : ");
		c = s.next().charAt(0);
		System.out.printf("두번째 수를 입력하세요 : ");
		second = s.nextInt();
		
		if (c == '+') {
			result = first + second;
		}else if (c == '-') {
			result = first - second;
		}else if (c == '*') {
			result = first * second;
		}else if (c == '/') {
			result = first / second;
		}else if (c == '%') {
			result = first % second;
		}else {
			System.out.printf("연산자를 잘못 입력 하셨습니다.");
			a = false;
		}
		if(a == true)
			System.out.printf("%f %c %f = %f 입니다.",first,c,second,result);

	}

}
