import java.util.Scanner;

public class Ex07_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		int basu;
		int result = 0;
		
		System.out.print("합계의 시작값 ==>");
		a = s.nextInt();
		System.out.print("합계의 끝값 ==>");
		b = s.nextInt();
		System.out.print("배수 ==>");
		basu = s.nextInt();
		
		int i = a;
		while(i <= b) {
			if(i % basu == 0) {
				result += i;
			}
			i++;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d",a,b,basu,result);


	}

}
