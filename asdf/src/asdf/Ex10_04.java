package asdf;

public class Ex10_04 {

	public static void main (String[] args)  {
		int a = 100,b = 0;
		int result;
		try {
			if(a == 0) {
				throw new MyException("0�� ������ 0�Դϴ�.");
			}else if(b == 0)
				throw new MyException("0���� ���������? �ȵ˴ϴ�!");
			
			result = a / b;
			System.out.print(result);
			
		}catch(Exception e){
			System.out.print("�߻����� ==>");
			System.out.println(e.getMessage());
		}

	}

}
