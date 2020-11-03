
public class Ex06_015 {

	public static void main(String[] args) {
		for(int i = 0; i <= 127; i++) {
			if(i % 16 == 0) {
				System.out.println("--------------------");
				System.out.println("10진수  16진수  문자");
				System.out.println("--------------------");
			}
			System.out.printf("%5d%5x%5c\n",i,i,i);
				
		}

	}

}
