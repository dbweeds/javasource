
public class Main {

	public static void main(String[] args) {
		Stack <String> ss = new Stack <String>(5);
		ss.push("안녕");
		ss.push("나는");
		ss.push("김지호");
		ss.push("라고");
		ss.push("한단다.");
		int size = ss.size();
		
		for(int i = 0;i <size;i++) {
			System.out.println(ss.pop());
		}
		
		

	}

}
