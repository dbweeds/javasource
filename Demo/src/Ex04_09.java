import java.util.Scanner;

public class Ex04_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m500,m100,m50,m10;
		int money = 0;
		
		System.out.printf("## 교환할 돈은 ? ");
		money = s.nextInt();
		
		m500 = money / 500;
		money = money % 500;
		m100 = money / 100;
		money = money % 100;
		m50 = money / 50;
		money = money % 50;
		m10 = money / 10;
		money = money % 10;
		System.out.printf("%n오백원짜리 ==> %d 개%n",m500);
		System.out.printf("백원짜리 ==> %d 개%n",m100);
		System.out.printf("오십원짜리 ==> %d 개%n",m50);
		System.out.printf("십원짜리 ==> %d 개%n",m10);
		System.out.printf("바꾸지 못한 잔돈 ==> %d 원%n",money);

	}

}
