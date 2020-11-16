package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx1 {

	public static void main(String[] args) throws Exception {
		System.out.println("==== 메뉴 ====");

		System.out.println("1. 예금죄회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 얘금 입급");
		System.out.println("4. 종료");

		System.out.println("메뉴 선택");
		
		InputStream in = System.in;
		char input = (char)in.read();
		switch (input) {
		case '1':
			System.out.println("예금조회선택");
			break;
		case '2':
			System.out.println("예금출금선택");
			break;
		case '3':
			System.out.println("예금입금선택");
			break;
		case '4':
			System.out.println("종료선택");
			break;
		default:
			
			break;
		}
		

	}

}
