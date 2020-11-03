package wlgh;

public class GParkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man[] group=new Man[3];
		group[0]=new Student("아영",30,"hello");
		group[1]=new Worker("민수",32,"lg");
		group[2]=new Man("진우",24);
		group[0].showResult();
		group[1].showResult();
		group[2].showResult();
		
	}
}
