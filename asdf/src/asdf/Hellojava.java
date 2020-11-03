package asdf;

import java.io.IOException;
import java.util.Scanner;

public class Hellojava {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a,b;
		char ch;
		int result = 0;
		
		System.out.print("첫번째 수를 입력하세요 : ");
		a = s.nextInt();
		System.out.print("계산할 연산자를 입력하세요 : ");
		ch = s.next().charAt(0);
		System.out.print("두번째 수를 입력하세요 : ");
		b = s.nextInt();

		try {
			switch(ch) {
				case '+':
					result = a+b;
					break;
				case '-':
					result = a-b;
					break;
				case '*':
					if((b == 0)||(a == 0))
						throw new Exception("0으로 곱하면 결과는 0이에요!!");
					else
						result = a*b;
					break;
				case '/':
					if(b == 0 )
						throw new Exception("0으론 나누지 못해요!!");
					else
						result = a/b;
					break;
				default:
					throw new Exception("연산자를 잘못입력했어욧");
				
			}
			
			if(result < 0)
				throw new Exception("우리는 음수는표현못해요");
			
			System.out.println("계산값 : " + result);
			
		}catch(Exception e){
			System.out.print("발생오류 ==> " + e.getMessage());
			
		}
	}

}
