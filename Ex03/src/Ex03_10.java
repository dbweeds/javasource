import java.util.Scanner;

public class Ex03_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a;
		int c;
		System.out.print("입력진수 결정 (1)10 (2)16 (3)8 : ");
		c = s.nextInt();
		System.out.print("값을 입력 ==>");
		a = s.next();
		int data = 0;
		
		if(c == 1){
			data = Integer.parseInt(a);
		}else if(c == 2){
			data = Integer.parseInt(a,16);
		}else if(c == 3){
			data = Integer.parseInt(a,8);
		}else {
			System.out.print("잘못입력하셨습니다.");
		}
		System.out.printf("10진수==> %d\n",data);
		System.out.printf("16진수==> %x\n",data);
		System.out.printf("8진수==> %o\n",data);
		
	}

}
