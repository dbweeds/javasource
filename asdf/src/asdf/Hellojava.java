package asdf;

import java.io.IOException;
import java.util.Scanner;

public class Hellojava {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a,b;
		char ch;
		int result = 0;
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		a = s.nextInt();
		System.out.print("����� �����ڸ� �Է��ϼ��� : ");
		ch = s.next().charAt(0);
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		b = s.nextInt();

		try {
			switch(ch) {
				case '+':
					result = a+b;
					break;
				case '-':
					result = a-b;
					break;
				case '*':
					if((b == 0)||(a == 0))
						throw new Exception("0���� ���ϸ� ����� 0�̿���!!");
					else
						result = a*b;
					break;
				case '/':
					if(b == 0 )
						throw new Exception("0���� ������ ���ؿ�!!");
					else
						result = a/b;
					break;
				default:
					throw new Exception("�����ڸ� �߸��Է��߾��");
				
			}
			
			if(result < 0)
				throw new Exception("�츮�� ������ǥ�����ؿ�");
			
			System.out.println("��갪 : " + result);
			
		}catch(Exception e){
			System.out.print("�߻����� ==> " + e.getMessage());
			
		}
	}

}
