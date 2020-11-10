
public class Ex08_21 {

	public static void main(String[] args) {
		int [][][] a = new int [10][10][10];
		int index = 0;
		int total = 0;
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				for(int k = 0;k < a[i][j].length;k++) {
					a[i][j][k] = ++index;
				}
			}
		}

		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				for(int k = 0;k < a[i][j].length;k++) {
					total += a[i][j][k];
				}
			}
		}
		System.out.printf("1~1000 까지 함계 : %d",total);
	}

}
