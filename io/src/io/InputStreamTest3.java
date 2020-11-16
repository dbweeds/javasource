package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest3 {

	public static void main(String[] args) throws Exception {
		//바이트 기반의 inputstream 생성
		InputStream in =System.in;
		
		//ascii 코드(영어,숫자)한글은 부여가 안되어 있음
		//키보드의 모든 키들은 특정 숫자값이 부여되어 있음
		//A : 65, a : 97
		
		//입력 스트립에서 한 바이트씩 읽어오기(맨앞글자 1바이트만 읽음)
		int input = in.read();
		System.out.println((char)input);

	}

}
