package exception;

/* Exception 과 Error(해결 못함 -컴퓨터 다운,인터넷끊김 등등...)
 * 
 * Exception(예외)
 * 컴파일 예외 - 코딩할때 이클립스에서 바로 알려줌
 * 런타임 예외 - 실행할 때 나타나는 예외사항
 */


public class ExceptionTest {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("입력값을 확인해 주세요.");
		}
	}

}
