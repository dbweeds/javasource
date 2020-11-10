import java.util.Scanner;

public class Ex07_19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int i = 0;
		int star;
		
		System.out.print("숫자를 여러 개 입력 : ");
		str = s.nextLine();
		while(true) {
			if(i > str.length()-1)
				break;
			ch = str.charAt(i);
			star = (int)ch - 48;
			
			for(int k = 0;k < star;k++) {
				System.out.print("*");
			}System.out.println();
			i++;
			
		}

	}

}
