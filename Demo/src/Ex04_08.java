import java.util.Scanner;

public class Ex04_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		System.out.printf("ù��° ����� ���� �Է��ϼ��� ==>");
		a = s.nextInt();
		
		System.out.printf("�ι�° ����� ���� �Է��ϼ��� ==>");
		b = s.nextInt();
		
		System.out.printf("%.2f + %.2f = %.2f\n",(double)a,(double)b,(double)a + (double)b);
		
		System.out.printf("%.2f - %.2f = %.2f\n",(double)a,(double)b,(double)a - (double)b);
		
		System.out.printf("%.2f * %.2f = %.2f\n",(double)a,(double)b,(double)a * (double)b);
		
		System.out.printf("%.2f / %.2f = %.2f\n",(double)a,(double)b,(double)a / (double)b);
		
		System.out.printf("%d %% %d = %d\n",a,b,a % b);
		
	}

}
