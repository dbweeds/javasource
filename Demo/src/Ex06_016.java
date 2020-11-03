import java.util.Scanner;

public class Ex06_016 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		while(true) {		
		System.out.print("글자를 입력 : ");
		str = s.nextLine();
		
		System.out.printf("입력한 문자열 ==> %s\n",str);
		System.out.printf("반환한 문자열 ==> ");
		
		for(int i =str.length() -1;i >= 0; i-- ) {
			System.out.printf("%c",str.charAt(i));
		}System.out.println();
		}

	}

}
