
public class Main {

	public static void main(String[] args) {
		Stack <String> ss = new Stack <String>(5);
		ss.push("�ȳ�");
		ss.push("����");
		ss.push("����ȣ");
		ss.push("���");
		ss.push("�Ѵܴ�.");
		int size = ss.size();
		
		for(int i = 0;i <size;i++) {
			System.out.println(ss.pop());
		}
		
		

	}

}
