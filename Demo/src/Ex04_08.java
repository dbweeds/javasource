import java.util.Scanner;

public class Ex04_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		System.out.printf("첫번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();
		
		System.out.printf("두번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();
		
		System.out.printf("%.2f + %.2f = %.2f\n",(double)a,(double)b,(double)a + (double)b);
		
		System.out.printf("%.2f - %.2f = %.2f\n",(double)a,(double)b,(double)a - (double)b);
		
		System.out.printf("%.2f * %.2f = %.2f\n",(double)a,(double)b,(double)a * (double)b);
		
		System.out.printf("%.2f / %.2f = %.2f\n",(double)a,(double)b,(double)a / (double)b);
		
		System.out.printf("%d %% %d = %d\n",a,b,a % b);
		
	}

}
