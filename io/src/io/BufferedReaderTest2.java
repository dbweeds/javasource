package io;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		//바이트 기반 스트림을 문자 기반 스트림으로 연결
		try(InputStreamReader reader = 
			new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"),"ms949")) {
			//이클립스 인코딩 : utf-8/ 메모장에서 적은 파일 ansi 저장
			//인코딩을 지정해서 파일이 안깨지게 읽는법
			int data = 0;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
