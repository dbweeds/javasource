import java.util.Scanner;

public class SoldeskEx_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[2][4];
		
		for(int i = 0;i < exams.length;i++) {
			System.out.printf("%d학생의 성적을 입력하세요..\n",i+1);
			
			for(int j = 0; j < exams[i].length;j++) {
				System.out.printf("%d번째 시험 성적 :",j+1);
				exams [i][j] = s.nextInt();
			}
		}
		System.out.println("-----------성적----------");
		for(int i = 0;i < exams.length;i++) {
			System.out.printf("%d학생의 성적 : ",i+1);
			int total = 0;
			for(int j = 0; j < exams[i].length;j++) {
				System.out.printf("%3d",exams[i][j]);
				total += exams [i][j];
			}
			System.out.printf("\t평균 : %.3f",total/(double)(exams[i].length));
			System.out.println();
		}

	}

}
