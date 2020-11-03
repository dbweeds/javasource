package asdf;

public class Ex09_16 {
	
	static void func1() {
		System.out.println("void 형 메소드는 돌려줄게 없음");
	}
	
	static int func2() {
		return 100;
	}
	
	public static void main(String[] args) {
		int a;
		
		func1();
		
		a = func2();
		
		System.out.println("int 형 메소드에서 돌려준 값 ==> "+ a);

	}

}
