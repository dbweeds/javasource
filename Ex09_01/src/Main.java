
public class Main {

	public static void main(String[] args) {
		Stack<Character>sc = new Stack<Character>(5);
		Stack<Integer>si = new Stack<Integer>(5);
		
		sc.push('a');
		sc.push('b');
		sc.push('c');
		sc.push('d');
		
		/*int size = sc.size();
		for(int i = 0; i <size;i++) {
			System.out.println(sc.pop());
		}*/
		int r = Stack.max(10, 20);
		System.out.println(r);
		
		boolean b = sc.compareSize(si);
		System.out.println(b);
	}

}
