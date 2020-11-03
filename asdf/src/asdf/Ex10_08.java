package asdf;

import java.io.IOException;

public class Ex10_08 {

	public static void main(String[] args) throws IOException {
		String userName = "hanbit";
		String input = "";
		int key;
		
		
			System.out.print("이름 ==> ");
			while((key = System.in.read()) != 13) {
				char ch = (char)key;
				if(ch >='0' && ch <='9')
					continue;
				input += Character.toString(ch);
			}
			
			if(userName.equals(input))
				System.out.println(input + "님 어서오시구연~~");
			else
				System.out.println(input + "님 등록이 안되어있구연~~");
		

	}

}
