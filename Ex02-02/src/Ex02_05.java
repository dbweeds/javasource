import java.io.IOException;
import java.util.Scanner;

public class Ex02_05 {

	public static void main(String[] args) throws IOException {
		int first, second, result;
		char operator;
		result = 0;
		boolean x = false;
		String op=null;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계살할 값을 입력하세요 ==> ");
		first = s.nextInt();
		System.out.print("+ - * / % ==> ");
		operator = (char)System.in.read();
		System.out.print("두번째 계살할 값을 입력하세요 ==> ");
		second = s.nextInt();
		
		if (operator == '+') {
			result = first + second;
			op = "+";
		}else if (operator == '-') {
			result = first - second;
			op = "-";
		}else if (operator == '*') {
			result = first * second;
			op = "*";
		}else if (operator == '/') {
			if(second != 0) {
			result = first / second;
			op = "/";
			}else {
			System.out.println("0을 나눌수 없습니다.");
			x = true;
			}
		}else if (operator == '%') {
			if(second != 0) {
				result = first % second;
				op = "%";
			}else {
				System.out.println("0을 나눌수 없습니다.");
				x = true;
				}
		}else {
			System.out.println("잘못 입력하셨습니다.");
			x = true;
		}
		if(x == false)
		System.out.println(first + op + second + " = " + result);
	}

}
