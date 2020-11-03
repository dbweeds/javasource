package asdf;

class myInt{
	int a;
}

public class Ex09_18 {

	static void func1(myInt m) {
		m = new myInt();
		m.a = m.a +1;
		System.out.println("전달받은 a ==> "+m.a);
	}
	
	public static void main(String[] args) {
		myInt m = new myInt();
		m.a = 10;
		
		func1(m);
		System.out.println("func1() 실행 후의 a==> "+m.a);
		

	}

}
