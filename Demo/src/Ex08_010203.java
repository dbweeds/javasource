import java.util.Scanner;

public class Ex08_010203 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int [] a =new int[10];
		int total = 0;
		
		for(int i = 0;i < a.length;i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ",i+1);
			a[i] = s.nextInt();
		}
		for(int i = 0;i < a.length;i++) {
			total += a[i];
		}
		
		System.out.printf("�հ� ==> %d",total);
	}

}
