import java.util.Scanner;

public class Ex04_09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hour, minute, second, a;
		
		
		System.out.printf("## ����� �ʴ� ? ");
		a = s.nextInt();
		
		hour = a / 3600;
		a = a % 3600;
		minute = a / 60;
		second = a % 60;

		System.out.printf("\n�ð��� ==> %d �ð�\n",hour);
		System.out.printf("���� ==> %d ��\n",minute);
		System.out.printf("�ʴ� ==> %d ��\n",second);

	}

}
