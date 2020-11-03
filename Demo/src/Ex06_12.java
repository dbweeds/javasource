import java.util.Scanner;

public class Ex06_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int level;
		
		System.out.print("¸î ´Ü? :");
		level = s.nextInt();
		
		for(int i = 1; i <= 9; ++i) {
			System.out.printf("%d X %d = %d\n",level,i,level * i);
		}

	}

}
