import java.util.Scanner;

public class dsfsf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "   한글 ABCD efgh   ";
		String result = "";
		
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) != ' ') {
				result += str.charAt(i);
			}
		}
		
		System.out.println("원 문자열 ==> [" + str + "]");
		System.out.println("공백제거 ==> [" + result + "]");
		

	}

}
