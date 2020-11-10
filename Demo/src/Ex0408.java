import java.util.Scanner;

public class Ex0408 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a , b;
		
		System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
		a = s.nextInt();
		System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
		b = s.nextInt();
		
		System.out.printf("%.2f + %.2f = %.2f\n",a,b,a+b);
		System.out.printf("%.2f - %.2f = %.2f\n",a,b,a-b);
		System.out.printf("%.2f * %.2f = %.2f\n",a,b,a*b);
		System.out.printf("%.2f / %.2f = %.2f\n",a,b,a/b);
		System.out.printf("%.0f %% %.0f = %.0f\n",a,b,a%b);

	}

}
