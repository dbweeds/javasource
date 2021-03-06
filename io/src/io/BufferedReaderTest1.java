package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderTest1 {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("c:\\temp\\file1.txt");
			BufferedReader br = new BufferedReader(reader);
			FileWriter writer = new FileWriter("c:\\temp\\file77.txt");
			BufferedWriter bw = new BufferedWriter(writer)) {
			
			
			
			String str = null;
			//데이터를 라인 단위로 처리(글자 한정)
			while((str=br.readLine())!=null) {
				bw.write(str);
				bw.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
