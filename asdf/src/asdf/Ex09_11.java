package asdf;

import java.util.Scanner;

public class Ex09_11 {
	static void  coffeMachine(int button) {
		String like;
		System.out.println("�߰ſ� ���� �غ��Ѵ�.");
		System.out.println("�������� �غ��Ѵ�.");
		
		switch (button) {
		case 1:
			System.out.println("����Ŀ�Ǹ� ź��.");
			like = "����";
			break;
		case 2:
			System.out.println("����Ŀ�Ǹ� ź��.");
			like = "����";
			break;
		case 3:
			System.out.println("��Ŀ�Ǹ� ź��.");
			like = "��";
			break;
		default:
			System.out.println("�ƹ�Ŀ�Ǹ� ź��.");
			like = "";
			break;
		}
		System.out.println("���� �״´�.");
		System.out.println("��Ǭ���� ��� ���δ�.");
		System.out.printf("�մ� �ֹ��Ͻ� %sĿ�ǳ��Խ��ϴ�.\n",like);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int coffe = 0;
		char i = 'A';
		while(true) {
			System.out.printf("%c�մ�~� Ŀ�Ǹ� �帱���? (1:���� 2:���� 3:��)---exit -1 :",i);
			coffe = s.nextInt();
			if(coffe == -1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			coffeMachine(coffe);
			i++;
		}

	}

}
