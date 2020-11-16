package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest4 {

	public static void main(String[] args) {
		//바이트 기반의 inputstream 생성
		InputStream in =System.in;
		//바이트 기반의 outsream생성
		OutputStream out = System.out;
		//ascii 코드(영어,숫자)한글은 부여가 안되어 있음
		//키보드의 모든 키들은 특정 숫자값이 부여되어 있음
		//A : 65, a : 97
		int input = 0;
		
		//입력 스트립에서 한 바이트씩 읽어오기(맨앞글자 1바이트만 읽음)
		try {
			while((input = in.read())!=-1) {
			//System.out.println((char)input);
			out.write(input);
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				close(in);
				close(out);
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}