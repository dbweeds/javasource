import java.util.Scanner;

public class Ex04080808 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int second;
		int hour;
		int minute;
		
		System.out.printf("## ����� �ʴ� ? ");
		second = s.nextInt();
		
		hour = second / 3600;
		second = second % 3600;
		
		minute = second / 60;
		second = second % 60;
		
		System.out.printf("%d �ð� %d �� %d �� �Դϴ�.",hour,minute,second);
	}

}
