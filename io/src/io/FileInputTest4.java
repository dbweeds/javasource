package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest4 {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in =new FileInputStream(new File("c:\\temp\\music.mp3"));
			out = new FileOutputStream(new File("c:\\temp\\music_copy.mp3"));
			byte[] b = new byte[4096];
			long start = System.currentTimeMillis();
			while(in.read(b)!= -1) {
				out.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사하는데 걸린시간"+(end - start));
		} catch (Exception e) {
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
