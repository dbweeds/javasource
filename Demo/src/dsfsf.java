import java.util.Scanner;

public class dsfsf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "   �ѱ� ABCD efgh   ";
		String result = "";
		
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) != ' ') {
				result += str.charAt(i);
			}
		}
		
		System.out.println("�� ���ڿ� ==> [" + str + "]");
		System.out.println("�������� ==> [" + result + "]");
		

	}

}
