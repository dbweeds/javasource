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
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==> ");
		first = s.nextInt();
		System.out.print("+ - * / % ==> ");
		operator = (char)System.in.read();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==> ");
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
			System.out.println("0�� ������ �����ϴ�.");
			x = true;
			}
		}else if (operator == '%') {
			if(second != 0) {
				result = first % second;
				op = "%";
			}else {
				System.out.println("0�� ������ �����ϴ�.");
				x = true;
				}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			x = true;
		}
		if(x == false)
		System.out.println(first + op + second + " = " + result);
	}

}
