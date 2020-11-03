
public class Main {

	public static void main(String[] args) {
		Map<Integer, String> map= new Map<Integer,String>(5);
		for(int i = 0; i < 5 ;i++)
			map.push(i, "ÀÌ³נ"+i);
		
		String s = map.get(3);
		System.out.println(s);
		
		for(int i =0;i<map.size();i++) {
			System.out.printf("%d ,%s \n",i,map.get(i) );
		}

	}

}
