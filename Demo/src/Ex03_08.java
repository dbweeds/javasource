import java.util.Scanner;

public class Ex03_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		int data;
		
		System.out.printf("16진수를 입력하세요 : ");
		str = s.next();
		data = Integer.parseInt(str,16);
		System.out.printf("입력한 16진수는 10진수로 %d 입니다",data);

	}

}
