package asdf;

import java.util.Scanner;

public class Ex09_11 {
	static void  coffeMachine(int button) {
		String like;
		System.out.println("뜨거운 물을 준비한다.");
		System.out.println("종이컵을 준비한다.");
		
		switch (button) {
		case 1:
			System.out.println("보통커피를 탄다.");
			like = "보통";
			break;
		case 2:
			System.out.println("설탕커피를 탄다.");
			like = "설탕";
			break;
		case 3:
			System.out.println("블랙커피를 탄다.");
			like = "블랙";
			break;
		default:
			System.out.println("아무커피를 탄다.");
			like = "";
			break;
		}
		System.out.println("물을 붓는다.");
		System.out.println("스푼으로 저어서 녹인다.");
		System.out.printf("손님 주문하신 %s커피나왔습니다.\n",like);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int coffe = 0;
		char i = 'A';
		while(true) {
			System.out.printf("%c손님~어떤 커피를 드릴까요? (1:보통 2:설탕 3:블랙)---exit -1 :",i);
			coffe = s.nextInt();
			if(coffe == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			coffeMachine(coffe);
			i++;
		}

	}

}
