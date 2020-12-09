package employee.ui;

import java.util.List;
import java.util.Scanner;

import employee.domain.EmployeeMenegerVO;
import employee.domain.EmployeeUpdateVO;
import employee.domain.EmployeeVO;

public class ConsoleUtil {
	public EmployeeMenegerVO loginMenger(Scanner sc) {
		EmployeeMenegerVO vo = new EmployeeMenegerVO();
		System.out.println("Meneger 아이디와 비밀번호를 입력하세요");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String passward = sc.next();
		vo.setId(id);
		vo.setPassward(passward);
		return vo;
	}
	public EmployeeVO loginUser(Scanner sc) {
		EmployeeVO vo = new EmployeeVO();
		System.out.println("User 아이디와 비밀번호를 입력하세요");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String passward = sc.next();
		vo.setId(id);
		vo.setPassward(passward);
		return vo;
	}
	public EmployeeUpdateVO updateEmployee(Scanner sc) {
		EmployeeUpdateVO vo = new EmployeeUpdateVO();
		System.out.print("수정하실 회원 no를 입력하세요 : ");
		vo.setNo(sc.nextInt());
		System.out.println("수정하실 목록을 입력하세요");
		System.out.println("<1>이름 <2>성별 <3>전화번호 <4>생년월일 <5>주소 <6>이메일 <7>연봉 <8>직책 <9>아이디 <10>비밀번호");
		switch(sc.nextInt()) {
		case 1:
			vo.setChoice("name");
			break;
		case 2:
			vo.setChoice("sex");	
			break;
		case 3:
			vo.setChoice("telno");
			break;
		case 4:
			vo.setChoice("birthday");
			break;
		case 5:
			vo.setChoice("address");
			break;
		case 6:
			vo.setChoice("email");
			break;
		case 7:
			vo.setChoice("pay");
			break;
		case 8:
			vo.setChoice("position");
			break;
		case 9:
			vo.setChoice("id");
			break;
			
		case 10:
			vo.setChoice("passward");
			break;
				}
		sc.nextLine();
		System.out.print("수정할 내용을 입력하세요 : ");
		vo.setAnswer(sc.nextLine());
		
		return vo;
	}
	public EmployeeVO addEmployee(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별 : ");
		String sex = sc.next();
		System.out.print("전화번호 : ");
		String telno = sc.next();
		System.out.print("생년월일 : ");
		String birthday = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("연봉 : ");
		int pay = sc.nextInt();
		System.out.print("직책 : ");
		String position = sc.next();
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String passward = sc.next();
		
		EmployeeVO vo = new EmployeeVO(name,sex,telno,birthday,address,email,pay,position,id,passward);
		
		return vo;
	}
	public void printEmlpoyeeList(List<EmployeeVO> list) {
		System.out.println("모든 회원 정보");
		System.out.println("no\t이름\t성별\t전화번호\t\t생년월일\t\t\t주소\t\t이메일\t\t연봉\t직책\t아이디\t비밀번호");
		for(EmployeeVO a:list) {
			System.out.print(a.getno()+"\t");
			System.out.print(a.getName()+"\t");
			System.out.print(a.getSex()+"\t");
			System.out.print(a.getTelno()+"\t");
			System.out.print(a.getBirthday()+"\t");
			System.out.print(a.getAddress()+"\t");
			System.out.print(a.getEmail()+"\t");
			System.out.print(a.getPay()+"\t");
			System.out.print(a.getPosition()+"\t");
			System.out.print(a.getId()+"\t");
			System.out.print(a.getPassward()+"\t");
		}
		System.out.println();
	
	}
	public int printEmployeeRemove(Scanner sc) {
		System.out.print("삭제하실 회원NO를 입력하세요 : ");
		return sc.nextInt();
	}
	public void preintRemoveSuccessMessage() {
		System.out.println(" 회원 정보 삭제 성공");
	}
	public void preintRemoveFailMessage() {
		System.out.println(" 회원 정보 삭제 실패");
	}
	public void preintUpdateSuccessMessage() {
		System.out.println(" 회원 정보 수정 성공");
	}
	public void preintUpdateFailMessage() {
		System.out.println(" 회원 정보 수정 실패");
	}
	public void addEmployeeSuccessMessage() {
		System.out.println("employee 추가 성공");
	}
	public void addEmployeeFailMessage() {
		System.out.println("employee 추가 실패");
	}
}
