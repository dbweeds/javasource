import java.util.Scanner;

public class Ex04_09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hour, minute, second, a;
		
		
		System.out.printf("## 계산할 초는 ? ");
		a = s.nextInt();
		
		hour = a / 3600;
		a = a % 3600;
		minute = a / 60;
		second = a % 60;

		System.out.printf("\n시간은 ==> %d 시간\n",hour);
		System.out.printf("분은 ==> %d 분\n",minute);
		System.out.printf("초는 ==> %d 초\n",second);

	}

}
