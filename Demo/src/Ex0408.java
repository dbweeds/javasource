import java.util.Scanner;

public class Ex0408 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a , b;
		
		System.out.printf("ù��° ����� ���� �Է��ϼ��� ==> ");
		a = s.nextInt();
		System.out.printf("�ι�° ����� ���� �Է��ϼ��� ==> ");
		b = s.nextInt();
		
		System.out.printf("%.2f + %.2f = %.2f\n",a,b,a+b);
		System.out.printf("%.2f - %.2f = %.2f\n",a,b,a-b);
		System.out.printf("%.2f * %.2f = %.2f\n",a,b,a*b);
		System.out.printf("%.2f / %.2f = %.2f\n",a,b,a/b);
		System.out.printf("%.0f %% %.0f = %.0f\n",a,b,a%b);

	}

}
