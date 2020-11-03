import java.util.Scanner;

public class Ex0409 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int mouny,m500,m100,m50,m10;
		
		System.out.printf("## 교환할 돈은?  ");
		mouny = s.nextInt();
		
		m500 = mouny / 500;
		mouny = mouny % 500;
		m100 = mouny / 100;
		mouny = mouny % 100;
		m50 = mouny / 50;
		mouny = mouny % 50;
		m10 = mouny / 10;
		mouny = mouny % 10;
		
		System.out.printf("\n오백원짜리 ==>  %d 개\n",m500);
		System.out.printf("백원짜리 ==>  %d 개\n",m100);
		System.out.printf("오십원짜리 ==>  %d 개\n",m50);
		System.out.printf("십원짜리 ==>  %d 개\n",m10);
		System.out.printf("바꾸지 못한 잔돈 ==>  %d 개\n",mouny);
	}

}
