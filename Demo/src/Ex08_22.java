import java.util.Scanner;

public class Ex08_22 {

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
					System.out.println("full!\n");
				}
				else{
				stack[top] = newCar++;
				System.out.printf("%c 차가 들어감\n",stack[top]);
				top++;
				}
				break;
				
			case 2:
				if(top <= 0) {
					System.out.println("empty!\n");
				}else {
					top--;
					System.out.printf("%c 차가 나감\n",stack[0]);
					for(int i = 0;i < stack.length-1;i++) {
						stack[i] = stack[i + 1];
					}
				}
				break;
				
			case 3:
				System.out.printf("현재 터널에 %d대가 있음.\n",top);
				System.out.printf("프로그램을 종료합니다.");
				break;
				
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
