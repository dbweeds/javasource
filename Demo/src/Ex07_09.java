import java.util.Scanner;

public class Ex07_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int hap = 0;
		int i;
		for(i = 1; i <= 100; i++) {
			hap += i;
			
			if(hap > 1000) {
				break;
			}
		}
		System.out.printf("1 ~ 100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? : %d",i);
	}

}
