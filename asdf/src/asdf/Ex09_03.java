package asdf;

import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.print("문자열 입력 ==> ");
		str = s.nextLine();
		
		System.out.println(str);
		strRep = str.replace("Java","자바");
		System.out.println(strRep);
		strSub = str.substring(5,8);
		System.out.println(strSub);
		strAry = strRep.split(" ");
		for(int i = 0;i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
	}

}
