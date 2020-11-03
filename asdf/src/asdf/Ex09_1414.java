package asdf;

import java.util.Scanner;

public class Ex09_1414 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int o1,o2;
		String operator;
		int result;
		
		System.out.print("��� ��ȣ �Է� (+, -, *, /) : ");
		operator = s.next();
		System.out.print("ù��° ���� : ");
		o1 = s.nextInt();
		System.out.print("�ι�° ���� : ");
		o2 = s.nextInt();
		
		result = clac(o1,o2,operator); 
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")){
			System.out.println("��� : "+result);
		}
		else
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");

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


