import java.util.Scanner;

public class Ex0410 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;
		
		
		System.out.printf("연도를 입력하세요 : ");
		year = s.nextInt();
		
		if(((year%4 == 0)&&(year%100!=0))||(year%400==0)) {
			System.out.printf("%d 년은 윤년입니다. ",year);
		}else {
			System.out.printf("%d 년은 윤년이아닙니다. ",year);
				
		}

	}

}
