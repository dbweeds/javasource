import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("손님 주문하시겠습니까?\n");
			System.out.print("(1)카페라떼(2)카푸치노(3)아메리카노(4)안시킬래요 =>");
			
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				System.out.printf("#카페라떼 주문하셨습니다.\n\n");
				break;
			case 2:
				System.out.printf("#카푸치노 주문하셨습니다.\n\n");
				break;
			case 3:
				System.out.printf("#아메리카노 주문하셨습니다.\n\n");
				break;
			case 4:
				System.out.printf("#주문하신 커피 준비하겠습니다.\n\n");
				break;
			default:
				System.out.printf("#잘못 주문하셨습니다.\n\n");
			}
			
		}while(menu != 4);

	}

}
