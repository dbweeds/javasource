package asdf;

public class Ex09_13 {

	public static void main(String[] args) {
		int hap;
		hap = plus(100,200);
		System.out.printf("100과 200의 plus() 메서드 결과는 : %d",hap);

	}

	private static int plus(int i, int j) {
		int result;
		result = i + j;
		return result;
	}

}
