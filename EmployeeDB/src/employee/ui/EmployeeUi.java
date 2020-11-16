package employee.ui;

import java.util.Scanner;

public class EmployeeUi {

	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Employee관리프로그램");
			System.out.println("1. 관리자 로그인");
			System.out.println("2. User로그인");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴선택");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				isStop = true;
				break;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
			
		}while(!isStop);

	}

}
