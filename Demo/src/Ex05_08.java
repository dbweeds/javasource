import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		a = s.nextInt();
		
		if(a > 90){
			System.out.print("A �����Դϴ�.");
		}else if(a > 80){
			System.out.print("B �����Դϴ�.");
		}else if(a > 70){
			System.out.print("C �����Դϴ�.");
		}else if(a > 60){
			System.out.print("D �����Դϴ�.");
		}else 
			System.out.print("F �����Դϴ�.");
		

	}

}
