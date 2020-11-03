import java.util.Scanner;

public class Ex03_07 {

	public static void main(String[] args) {
		float a = 123.45f , b;
		int c;
		c = (int)a;
		b = c;
		System.out.printf("%6.2f",b);
		
		Scanner s = new Scanner(System.in);
		String str;
		int j = 0;
		
		System.out.printf("문자열을 입력 ==>");
		str = s.nextLine();
		
		for(int i = str.length() - 1;j <= i; j++) {
			System.out.printf("%c",str.charAt(j));
			
		}
		

	}

}
