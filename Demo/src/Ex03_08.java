import java.util.Scanner;

public class Ex03_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		int data;
		
		System.out.printf("16������ �Է��ϼ��� : ");
		str = s.next();
		data = Integer.parseInt(str,16);
		System.out.printf("�Է��� 16������ 10������ %d �Դϴ�",data);

	}

}
