
public class Ex08_20 {

	public static void main(String[] args) {
		int [][] a = new int [9][9];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0;j < a[i].length;j++) {
				a [i][j] = (i+1)*(j+1);
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0;j < a[i].length;j++) {
			System.out.printf("%d X %d =%2d  ",i+1,j+1,a[i][j]);	
			}
			System.out.println();
		}	

	}

}
