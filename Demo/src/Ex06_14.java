
public class Ex06_14 {

	public static void main(String[] args) {
		for(int i = 2; i < 10 ;i++) {
			System.out.printf(" #Á¦%d´Ü# ",i);
		}System.out.printf("\n\n");
		
		for(int i = 1;i < 10; i++) {
			for(int j = 2;j < 10; j++) {
				System.out.printf("%2dX%2d=%2d",j,i,j*i);
			}System.out.println();
		}
		

	}

}
