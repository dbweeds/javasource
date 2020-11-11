package Ui;

import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		System.out.println("===== UserTBL =====");
		System.out.println("1. 조회");
		System.out.println("2. 삽입");
		System.out.println("3. 삭제");
		System.out.println("4. 수정");
		System.out.println("===================");
		
		System.out.print("번호입력 : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		
		
		
		
		
		
		
		
		
//		UserDAO dao = new UserDAO();
//		switch(menu) {
//		case 1:
//			System.out.println("userTBL 전체 출력");
//			List<UserVO> list =dao.getList();
//			for(UserVO a :list)
//				System.out.println(a);
//			
//			break;
//		case 2:
//			UserVO vo = new UserVO();
//			System.out.println("회원정보 입력");
//			System.out.print("이름 입력 :");
//			vo.setUserName(sc.next());
//			System.out.print("출생연도 입력 :");
//			vo.setBirthYear(sc.nextInt());
//			System.out.print("주소 입력 :");
//			vo.setAddr(sc.next());
//			System.out.print("전화번호 입력 :");
//			vo.setMobile(sc.next());
//			System.out.println(dao.insertUser(vo)?"입력성공":"입력실패");
//			
//			break;
//		case 3:
//			System.out.print("삭제할 회원번호 입력 :");
//			int no = sc.nextInt();
//			System.out.println(dao.deleteUser(no)?"삭제성공":"삭제실패");
//			break;
//		case 4:
//			System.out.println("수정할 회원정보 입력");
//			System.out.print("수정할 회원번호 입력 : ");
//			no = sc.nextInt();
//			System.out.print("수정할 주소 입력 : ");
//			String addr = sc.next();
//			System.out.println(dao.updateUser(addr, no)?"수정성공":"수정실패");
//			break;
//		}
	}

}
