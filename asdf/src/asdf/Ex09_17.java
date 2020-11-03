package asdf;

public class Ex09_17 {

	static void func1(int a) {
		a = a+1;
		System.out.println("전달받는 a ==> "+ a);
	}
	
	public static void main(String[] args) {
		int a = 10;
		
		func1(a);
		System.out.println("func() 실행 후의 a ==> "+a);

	}

}
