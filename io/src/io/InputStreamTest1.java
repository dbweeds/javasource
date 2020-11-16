package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest1 {

	public static void main(String[] args) {
		//바이트 기반의 inputstream 생성
		InputStream in =System.in;
		//바이트 기반의 outsream생성
		OutputStream out = System.out;
	
		
		//입력 스트립에서 바이트 배열로 읽어오기
		byte[] b = new byte[100];
		//입력 스트립에서 한 바이트씩 읽어오기(맨앞글자 1바이트만 읽음)
		try {
			while(in.read(b)!=-1) {
			//System.out.println((char)input);
			out.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}