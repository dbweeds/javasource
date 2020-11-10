import java.util.Scanner;

public class Ex03_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
	
		System.out.print("정수를 입력하세요 ==>");
		a = s.nextInt();
		
		System.out.printf("10진수==> %d\n",a);
		System.out.printf("16진수==> %x\n",a);
		System.out.printf("8진수==> %o\n",a);
	
	}

}
