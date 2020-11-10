import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int guess=32;
		int value;
		
		System.out.print("숫자를 입력하세요 : ");
		
		do {
			value = s.nextInt();
			
			if(value > guess) {
				System.out.println("작은수를 입력하세요");
			}else if(value < guess) {
				System.out.println("큰수를 입력하세요");
		}
		}while(value != guess);
		System.out.println("정답입니다.");

	}

}
