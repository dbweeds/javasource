package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedinputStreamTest1 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("c:\\temp\\file11.txt");
			BufferedInputStream bis = new BufferedInputStream(in);
			OutputStream out = new FileOutputStream("c:\\temp\\file11_copy3.txt");
			BufferedOutputStream bos = new BufferedOutputStream(out)){
			
			int data = 0;
			while((data = in.read())!=-1) {
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
