package asdf;

import java.util.Scanner;

public class Ex09_14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int o1,o2,operator;
		int result;
		
		System.out.print("계산 입력 (1 = +, 2 = -, 3 = *, 4 = /) : ");
		operator = s.nextInt();
		System.out.print("첫번째 숫자 : ");
		o1 = s.nextInt();
		System.out.print("두번째 숫자 : ");
		o2 = s.nextInt();
		
		result = clac(o1,o2,operator); 
		System.out.println("결과 : "+result);

	}

	private static int clac(int o1, int o2, int operator) {
		int result = 0;
		switch(operator) {
		case 1:
			result = o1 + o2;
			break;
		case 2:
			result = o1 - o2;
			break;
		case 3:
			result = o1 * o2;
			break;
		case 4:
			if(o2 == 0)
				break;
			result = o1 / o2;
			break;
		}
		return result;
	}

}
