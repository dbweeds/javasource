import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;
		int val = 0;
		int a = 1;
		
		System.out.print("�� ������ �Է� : ");
		row = s.nextInt();
		System.out.print("�� ������ �Է� : ");
		col = s.nextInt();
		
		int [][] aa = new int [row][col];
		
		for(int i = 0; i < row; i++) {
			aa[i][0] = a; 
			val = a;
				for(int j = 1; j < col; j++) {
				val += aa.length;
				aa[i][j] = val;
			}
			a++;
		}
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ��� \n",row-1,col-1);
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%4d",aa[i][j]);
			}
			System.out.println();
		}
	}

}
