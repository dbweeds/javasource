import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char [] stack = new char[5];
		int select=0;
		char carName = 'A';
		int top = 0;
		
		while(select != 3) {
			System.out.print("1: Push, 2: pop, 3:end : ");
			select = s.nextInt();
		
		
		switch(select) {
		case 1:
			if(top >= 5) {
				System.out.println("full!");
				
			}else {
				stack[top] = carName++;
				System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
				top++;
			}
			break;
			
		case 2:
			if(top <= 0) {
				System.out.println("empty!");
				
			}else {
				top--;
				carName--;
				System.out.printf("%c �ڵ����� ��������\n",stack[top]);
			}
			break;
			
		case 3:
			System.out.printf("%d�� ���� ����\n",top);
			System.out.println("end!");
			break;
			
		default:
			System.out.println("again!\n");
		}
		
		}
	}

}
