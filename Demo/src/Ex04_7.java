
public class Ex04_7 {

	public static void main(String[] args) {
	
		int num1 = 100;
		int num2 = -200;
		
		boolean a = (num1 != 0);
		
		boolean b = (num2 != 0);
		
		System.out.printf("상수의 AND 연산 : %s \n",a && b);

		System.out.printf("상수의 OR 연산 : %s \n",a || b);

		System.out.printf("상수의 NOT 연산 : %s \n", !a);
	}

}
