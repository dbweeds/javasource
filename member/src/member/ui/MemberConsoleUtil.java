package member.ui;

import java.util.List;
import java.util.Scanner;

import member.domian.MemberVO;

public class MemberConsoleUtil {
	public MemberVO getNewMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("국가 : ");
		String nation = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		return new MemberVO(name,addr,email,nation,age);
		
	}
	public void preintAddSuccessMessage(String name) {
		System.out.println(name+" 회원 정보 추가 성공");
	}
	
	public MemberVO printMemberUpdate(Scanner sc) {
		MemberVO vo = new MemberVO();
		System.out.print("수정하실 회원ID를 입력하세요 : ");
		vo.setId(sc.nextInt());
		System.out.print("수정하실 주소를 입력하세요 : ");
		sc.nextLine();
		vo.setAddr(sc.nextLine());
		System.out.print("수정하실 이메일를 입력하세요 : ");
		vo.setEmail(sc.next());
		return vo;
	}
	public void  preintMemberSearch(MemberVO vo) {
		System.out.println("******* 회원 정보 *******");
		System.out.println("아이디\t이름\t주소\t\t국가\t이메일\t\t\t나이");
		System.out.print(vo.getId()+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getAddr()+"\t");
		System.out.print(vo.getNation()+"\t");
		System.out.print(vo.getEmail()+"\t");
		System.out.print(vo.getAge()+"\t");
		System.out.println();
	}
	public void preintMemberList(List<MemberVO> list) {
		System.out.println("******* 모든 회원 정보 *******");
		System.out.println("아이디\t이름\t주소\t\t국가\t이메일\t\t\t나이");
		for(MemberVO a:list) {
			
			System.out.print(a.getId()+"\t");
			System.out.print(a.getName()+"\t");
			System.out.print(a.getAddr()+"\t");
			System.out.print(a.getNation()+"\t");
			System.out.print(a.getEmail()+"\t");
			System.out.print(a.getAge()+"\t");
			System.out.println();
		}
		System.out.println();
	}
	public int printMemberRowRemove(Scanner sc) {
		System.out.print("조회(삭제)하실 회원ID를 입력하세요 : ");
		return sc.nextInt();
	}
	public void preintRemoveSuccessMessage() {
		System.out.println(" 회원 정보 삭제 성공");
	}
	public void preintRemoveFailMessage() {
		System.out.println(" 회원 정보 삭제 실패");
	}
	public void preintUpdateSuccessFail(boolean service) {
		System.out.println(service?" 회원 정보 수정 성공":" 회원 정보 수정 실패");
	}
	
}
