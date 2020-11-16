package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest5 {

	public static void main(String[] args) {
		
		//try~with~resource
		//AutoCloseble을 구현한 객체만 사용이 가능
		try(InputStream in =new FileInputStream(new File("c:\\temp\\music.mp3"));
			OutputStream out = new FileOutputStream(new File("c:\\temp\\music_copy.mp3"));){
//			in =new FileInputStream(new File("c:\\temp\\music.mp3"));
//			out = new FileOutputStream(new File("c:\\temp\\music_copy.mp3"));
			byte[] b = new byte[8192];
			long start = System.currentTimeMillis();
			while(in.read(b)!= -1) {
				out.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사하는데 걸린시간"+(end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
