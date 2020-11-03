import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("정수를 입력하세요 : ");
		a = s.nextInt();
		
		if(a % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		

	}

}
