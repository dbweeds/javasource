import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		String ch;
		
		while(true) {
			System.out.print("ù��° ���� �Է� : ");
			a = s.nextInt();
			System.out.print("�ι�° ���� �Է� : ");
			b = s.nextInt();
			System.out.print("����� ������ �Է�(�����ҷ��� !) : ");
			ch = s.next();
			if(ch.equals("!"))
				break;
			
			switch(ch) {
			case "+":
				System.out.printf("%d + %d = %d �Դϴ�.\n",a,b,a + b);
				break;
			case "-":
				System.out.printf("%d - %d = %d �Դϴ�.\n",a,b,a - b);
				break;
			case "*":
				System.out.printf("%d * %d = %d �Դϴ�.\n",a,b,a * b);
				break;
			case "/":
				System.out.printf("%d / %d = %f �Դϴ�.\n",a,b,a / (float)b);
				break;
			case "%":
				System.out.printf("%d %% %d = %d �Դϴ�.\n",a,b,a % b);
				break;
			default:
				System.out.printf("�����ڸ� �߸� �Է��ϼ̽��ϴ�.\n");
				break;
			}
		}
	}

}
