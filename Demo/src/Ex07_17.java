import java.util.Scanner;

public class Ex07_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		int basu;
		int result = 0;
		
		System.out.print("�հ��� ���۰� ==>");
		a = s.nextInt();
		System.out.print("�հ��� ���� ==>");
		b = s.nextInt();
		System.out.print("��� ==>");
		basu = s.nextInt();
		
		int i = a;
		while(i <= b) {
			if(i % basu == 0) {
				result += i;
			}
			i++;
		}
		System.out.printf("%d���� %d������ %d����� �հ� ==> %d",a,b,basu,result);


	}

}
