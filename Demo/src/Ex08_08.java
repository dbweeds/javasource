
public class Ex08_08 {

	public static void main(String[] args) {
		int [][] a = new int[3][4];
		int val = 1;
		
		for(int i = 0;i < a.length;i++) {
			if(i % 2 == 0) {
			for(int j = 0;j < a[i].length;j++) {
				a[i][j] = val;
				val++;
			}
			}else if(i % 2 != 0) {
				for(int j = a[i].length - 1 ;j >= 0;j--) {
					a[i][j] = val;
					val++;
				}
			}
		}
		System.out.println("a[0][0]부터 a[3][4]까지 출력");
		
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				System.out.printf("%3d\t",a[i][j]);
			}System.out.println();
		}
	}

}