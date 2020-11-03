package asdf;

import java.util.Scanner;

public class Ex09_1414 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int o1,o2;
		String operator;
		int result;
		
		System.out.print("계산 부호 입력 (+, -, *, /) : ");
		operator = s.next();
		System.out.print("첫번째 숫자 : ");
		o1 = s.nextInt();
		System.out.print("두번째 숫자 : ");
		o2 = s.nextInt();
		
		result = clac(o1,o2,operator); 
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")){
			System.out.println("결과 : "+result);
		}
		else
			System.out.println("부호를 잘못 입력하셨습니다.");

	}

	private static int clac(int o1, int o2, String operator) {
		int result = 0;
		switch(operator) {
		case "+":
			result = o1 + o2;
			break;
		case "-":
			result = o1 - o2;
			break;
		case "*":
			result = o1 * o2;
			break;
		case "/":
			if(o2 == 0)
				break;
			result = o1 / o2;
			break;
		}
		return result;
	}

	}


