package asdf;

public class Ex10_04 {

	public static void main (String[] args)  {
		int a = 100,b = 0;
		int result;
		try {
			if(a == 0) {
				throw new MyException("0은 나눠도 0입니다.");
			}else if(b == 0)
				throw new MyException("0으로 나누려고요? 안됩니다!");
			
			result = a / b;
			System.out.print(result);
			
		}catch(Exception e){
			System.out.print("발생오류 ==>");
			System.out.println(e.getMessage());
		}

	}

}
