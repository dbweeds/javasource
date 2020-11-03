package asdf;

public class eX09_08 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";
		
		System.out.println("원 문자열 1 ==> "+str1);
		System.out.println("원 문자열 2 ==> "+str2);
		
		System.out.println(str1.compareTo(str2) > 0);
		System.out.println(str1.contains("Java"));
	}

}
