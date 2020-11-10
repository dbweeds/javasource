
public class Ex06_09 {

	public static void main(String[] args) {
		int hap = 0;

		for(int i = 501; i <= 1000; i += 2) {
			hap += i;
		}
		System.out.printf("500 에서 1000까지의 홀수의 합 : %d",hap);
	}

}
