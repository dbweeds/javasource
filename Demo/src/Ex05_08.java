import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("점수를 입력하시요 : ");
		a = s.nextInt();
		
		if(a > 90){
			System.out.print("A 학점입니다.");
		}else if(a > 80){
			System.out.print("B 학점입니다.");
		}else if(a > 70){
			System.out.print("C 학점입니다.");
		}else if(a > 60){
			System.out.print("D 학점입니다.");
		}else 
			System.out.print("F 학점입니다.");
		

	}

}
