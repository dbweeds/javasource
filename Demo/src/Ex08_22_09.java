import java.util.Scanner;

public class Ex08_22_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] stack = new char [5];
		char newCar = 'A';
		int select = 0;
		int top = 0;
		
		while(select != 3) {
			System.out.print("1=�ڵ��� �ֱ� 2=�ڵ��� ���� 3=�� : ");
			select = s.nextInt();
			
			switch(select) {
			case 1:
				if(top >= stack.length) {
					System.out.print("���� �ڵ��� ==>");
					for(int i = 0;i < top;i++) {
					System.out.printf("%c  ",stack[i]);
					}
					System.out.println("full!\n");
				}
				else{
				stack[top] = newCar++;
				top++;
				System.out.print("���� �ڵ��� ==>");
				for(int i = 0;i < top;i++) {
				System.out.printf("%c  ",stack[i]);
				}
				System.out.println();

				}
				break;
				
			case 2:
				if(top <= 0) {
					System.out.print("���� �ڵ��� ==>");
					for(int i = 0;i <= top;i++) {
					System.out.printf("%c  ",stack[i]);
					}
					System.out.println("empty!\n");
				}else {
					top--;
					for(int i = 0;i < stack.length-1;i++) {
						stack[i] = stack[i + 1];
					}
					System.out.print("���� �ڵ��� ==>");
					for(int i = 0;i < top;i++) {
					System.out.printf("%c  ",stack[i]);
					}
					System.out.println();
				}
				break;
				
			case 3:
				System.out.print("���� �ڵ��� ==>");
				for(int i = 0;i < top;i++) {
				System.out.printf("%c  ",stack[i]);
				}
				System.out.printf("�� %d��\n",top);
				System.out.printf("���α׷��� �����մϴ�.");
				break;
				
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}


	}

}
