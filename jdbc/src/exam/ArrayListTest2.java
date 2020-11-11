package exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member(1234,"홍길동"));
		list.add(new Member(1235,"길동"));
		list.add(new Member(1236,"동"));
		list.add(new Member(1237,"홍"));
		list.add(new Member(1238,"홍길"));
		
		for(Member a:list) {
			System.out.println(a);
		}
		System.out.println();
		//특정 요소 확인
		System.out.println(list.get(2));
	}

}
