package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class IOTest2 {

	public static void main(String[] args) {
		//아무파일이나 선택한 후 소스파일을 읽고
		//라인번호를 추가시켜 화면에 출력하기
		try(FileReader read = new FileReader("C:\\Users\\soldesk\\eclipse-workspace\\io\\src\\io\\InputStreamTest4.java");
			BufferedReader fr = new BufferedReader(read)) {
			int i = 1;
			String str = "";
			while((str = fr.readLine()) != null) {
				System.out.print(i++);
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
