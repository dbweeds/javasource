import java.util.ArrayList;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("¿œ");
		list.add("¿Ã");
		list.add("ªÔ");
		list.add("ªÁ");
		
		String str = list.get(2);
		System.out.println(str);
		
		list.remove(0);
		list.remove("ªÔ");
		
		for(int i = 0;i <10;i++) {
			list.add("List"+i);
		}
		
		for(String s: list) {
			System.out.println(s);
		}
		int size = list.size();
		System.out.println(size);
		
		String [] arrs = new String [list.size()];
		arrs = list.toArray(arrs);
		for(String s:arrs) {
			System.out.println(s);
		}
		
		Iterator <String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
