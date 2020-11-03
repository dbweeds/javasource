import java.util.Scanner;

public class Ex08_22_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] stack = new char [5];
		char newCar = 'A';
		int select = 0;
		int top = 0;
		
		while(select != 3) {
			System.out.print("1=자동차 넣기 2=자동차 빼기 3=끝 : ");
			select = s.nextInt();
			
			switch(select) {
			case 1:
				if(top >= stack.length) {
					System.out.print("현재 자동차 ==>");
					for(int i = 0;i < top;i++) {
					System.out.printf("%c  ",stack[i]);
					}
					System.out.println("full!\n");
				}
				else{
				stack[top] = newCar++;
				top++;
				System.out.print("현재 자동차 ==>");
				for(int i = 0;i < top;i++) {
				System.out.printf("%c  ",stack[i]);
				}
				System.out.println();

				}
				break;
				
			case 2:
				if(top <= 0) {
					System.out.print("현재 자동차 ==>");
					for(int i = 0;i <= top;i++) {
					System.out.printf("%c  ",stack[i]);
					}
					System.out.println("empty!\n");
				}else {
					top--;
					for(int i = 0;i < stack.length-1;i++) {
						stack[i] = stack[i + 1];
					}
					System.out.print("현재 자동차 ==>");
					for(int i = 0;i < top;i++) {
					System.out.printf("%c  ",stack[i]);
					}
					System.out.println();
				}
				break;
				
			case 3:
				System.out.print("현재 자동차 ==>");
				for(int i = 0;i < top;i++) {
				System.out.printf("%c  ",stack[i]);
				}
				System.out.printf("총 %d대\n",top);
				System.out.printf("프로그램을 종료합니다.");
				break;
				
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}


	}

}
