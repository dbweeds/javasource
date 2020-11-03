import java.util.Scanner;

public class Ex04080808 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int second;
		int hour;
		int minute;
		
		System.out.printf("## 계산할 초는 ? ");
		second = s.nextInt();
		
		hour = second / 3600;
		second = second % 3600;
		
		minute = second / 60;
		second = second % 60;
		
		System.out.printf("%d 시간 %d 분 %d 초 입니다.",hour,minute,second);
	}

}
