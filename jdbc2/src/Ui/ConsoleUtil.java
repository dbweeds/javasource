package Ui;

import java.util.List;
import java.util.Scanner;

import Domain.UserVO;

//콘솔로부터 사용자가 입력한 정보를 읽어드리거나 콘솔로 필요한 메시지를 출력
public class ConsoleUtil {
	public UserVO getNewUser(Scanner sc) {
		System.out.println("추가할 회원정보 입력");
		
		UserVO vo = new UserVO();
		System.out.print("이름 입력 :");
		vo.setUserName(sc.next());
		System.out.print("출생연도 입력 :");
		vo.setBirthYear(sc.nextInt());
		System.out.print("주소 입력 :");
		vo.setAddr(sc.next());
		System.out.print("전화번호 입력 :");
		vo.setMobile(sc.next());
		
		return vo;
		//System.out.println(dao.insertUser(vo)?"입력성공":"입력실패");
	}
	//user 입력 성공 메시지
	public void printAddSuccessMessage(UserVO user) {
		System.out.println(user.getUserName() + "정보 추가 성공");
	}
	//user 입력 실패 메시지
	public void printAddFailMessage(UserVO user) {
		System.out.println(user.getUserName() + "정보 추가 실패");
	}
	
	//전체 조회 출력하기
	public void printUserList(List<UserVO> list) {
		System.out.println("====userTBL 전체 출력====");
		for(UserVO a :list)
			System.out.println(a);
	}
	//개별 조회 및 삭제
	public int printUserRow(Scanner sc) {
		System.out.print("조회(삭제)할 사용자 번호 : ");
		int no = sc.nextInt();
		return no;
	}
	public void printUserDetail(UserVO user) {
		System.out.println("====조회할 사용자는 다음과 같습니다====");
		System.out.println(user);
	}
	//user 삭제 성공 메시지

	public void printRemoveSuccessMessage() {
		System.out.println("User 삭제 성공");
	}
	//user 삭제 실패 메시지
	public void printRemoveFailMessage() {
		System.out.println("User 삭제 실패");
	}
	
	public UserVO printUpdateMessage(Scanner sc) {
		System.out.println("==USER 수정==");
		System.out.print("수정할 회원번호 입력 : ");
		int no = sc.nextInt();
		System.out.print("수정할 주소 입력 : ");
		String addr = sc.next();
		
		UserVO vo = new UserVO();
		vo.setNo(no);
		vo.setAddr(addr);
		return vo;
	}
	
	public void printUpdateSuccessMessage() {
		System.out.println("회원정보수정 성공");
	}
	public void printUpdateFailMessage() {
		System.out.println("회원정보수정 실패");
	}

}
