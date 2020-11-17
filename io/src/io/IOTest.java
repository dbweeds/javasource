package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		//키보드에서 입력 을 받아들여 파일에 출력하는 프로그램 작성
		//조건 : 키보드에서 q가 입력되기전까지 계속 받아들이기
		//Scanner sc = new Scanner(System.in);
		//InputStream in =System.in;
		int a = 0;

		try(OutputStream out = new FileOutputStream(new File("c:\\temp\\fileTest.txt"))) {
			while ((char)(a=System.in.read()) != 'q') {
				out.write(a);
			}

		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
