package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class IOTest22 {

	public static void main(String[] args) {
		//아무파일이나 선택한 후 소스파일을 읽고
		//라인번호를 추가시켜 화면에 출력하기
		String path  = System.getProperty("user.dir");
		//System.out.println(path);
		try(FileReader fr = new FileReader(path+"\\src\\io\\FileInputTest1.java");
			BufferedReader  bfr = new BufferedReader(fr)) {
			int i = 1;
			String data = null;
			while((data = bfr.readLine())!=null) {
				System.out.println((i++)+" "+data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
