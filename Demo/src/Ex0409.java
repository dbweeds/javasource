import java.util.Scanner;

public class Ex0409 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int mouny,m500,m100,m50,m10;
		
		System.out.printf("## ��ȯ�� ����?  ");
		mouny = s.nextInt();
		
		m500 = mouny / 500;
		mouny = mouny % 500;
		m100 = mouny / 100;
		mouny = mouny % 100;
		m50 = mouny / 50;
		mouny = mouny % 50;
		m10 = mouny / 10;
		mouny = mouny % 10;
		
		System.out.printf("\n�����¥�� ==>  %d ��\n",m500);
		System.out.printf("���¥�� ==>  %d ��\n",m100);
		System.out.printf("���ʿ�¥�� ==>  %d ��\n",m50);
		System.out.printf("�ʿ�¥�� ==>  %d ��\n",m10);
		System.out.printf("�ٲ��� ���� �ܵ� ==>  %d ��\n",mouny);
	}

}
