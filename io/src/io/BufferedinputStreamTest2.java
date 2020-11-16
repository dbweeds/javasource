package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedinputStreamTest2 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("c:\\temp\\picture.jpg")){
			
			int data = 0;
			long start = System.currentTimeMillis();
			while((data = in.read())!=-1) {
			}
			long end = System.currentTimeMillis();
			System.out.println("inputstream 만 사용했을때 :"+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(InputStream in = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(in)){
			
			int data = 0;
			long start = System.currentTimeMillis();
			while((data = in.read())!=-1) {
			}
			long end = System.currentTimeMillis();
			System.out.println("inputstream+bufferedinputstream 사용했을때 :"+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(InputStream in = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream("c:\\temp\\picture_copy9.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(out)){
				
				int data = 0;
				long start = System.currentTimeMillis();
				while((data = in.read())!=-1) {
					bos.write(data);
				}
				long end = System.currentTimeMillis();
				System.out.println("input/output시 보조스트림 사용했을때 :"+(end-start));
			} catch (Exception e) {
				e.printStackTrace();
			}
		try(InputStream in = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream("c:\\temp\\picture_copy9.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(out)){
				
				byte b[] = new byte[8192];
				long start = System.currentTimeMillis();
				while(in.read(b)!=-1) {
					bos.write(b);
				}
				long end = System.currentTimeMillis();
				System.out.println("input/output시 보조스트림 사용했을때 :"+(end-start));
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
}
