import java.util.Scanner;

public class Ex05_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double first,second;
		char c;
		double result = 0;
		boolean a =true;
		
		System.out.printf("ù��° ���� �Է��ϼ��� : ");
		first = s.nextInt();
		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		c = s.next().charAt(0);
		System.out.printf("�ι�° ���� �Է��ϼ��� : ");
		second = s.nextInt();
		
		if (c == '+') {
			result = first + second;
		}else if (c == '-') {
			result = first - second;
		}else if (c == '*') {
			result = first * second;
		}else if (c == '/') {
			result = first / second;
		}else if (c == '%') {
			result = first % second;
		}else {
			System.out.printf("�����ڸ� �߸� �Է� �ϼ̽��ϴ�.");
			a = false;
		}
		if(a == true)
			System.out.printf("%f %c %f = %f �Դϴ�.",first,c,second,result);

	}

}
