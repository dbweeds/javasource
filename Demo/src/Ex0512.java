import java.util.Scanner;

public class Ex0512 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		char c;
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		a = s.nextInt();
		
		System.out.print("����� �����ڸ� �Է��ϼ��� : ");
		c = s.next().charAt(0);
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		b = s.nextInt();
		
		if(c == '+')
			System.out.printf("%d %c %d = %d �Դϴ�.",a,c,b,a+b);
		else if(c == '-')
			System.out.printf("%d %c %d = %d �Դϴ�.",a,c,b,a-b);
		else if(c == '*')
			System.out.printf("%d %c %d = %d �Դϴ�.",a,c,b,a*b);	
		else if(c == '/')
			System.out.printf("%d %c %d = %f �Դϴ�.",a,c,b,(double)a/b);
		else if(c == '%')
			System.out.printf("%d %c %d = %d �Դϴ�.",a,c,b,a%b);
		else
			System.out.printf("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
	}

}
