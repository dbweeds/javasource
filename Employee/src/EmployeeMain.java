import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int i = 0;
		int a ;
		String passward;
		String sex;
		String telno;
		String birthday;
		String address;
		String email;
		double pay;
		String position;
		int choice;
		
		Employee employee[] = new Employee[100];

		while(true) {
			a = 0;
			System.out.print("사원검색 <1>  사원입력 <2>  총인원<3> :");
			choice = s.nextInt();
			if(choice == 3) {
				System.out.println("현재 총 사원 수는 "+Employee.getCount()+"명 입니다.");
			}
			else if(choice == 1) {
				if(i == 0) {
					System.out.println("사원명이 총 0명입니다.");
					continue;
				}
				System.out.print("이름을 입력하세요 : ");
				name = s.next();
				for(int j = 0;j < i;) {
					if(employee[j].getName().equals(name)) {
						a = 0;
						System.out.print("비밀번호를 입력하세요 : ");
						if(!employee[j].getPassward().equals(s.next())) {
							System.out.println("비밀번호가 틀리셨습니다.");
							break;
						}
						employee[j].displayBasicEmployee();
						while(true) {
							System.out.print("정보수정 <1>  월급검색 <2> 나가기 <3> : ");
							choice = s.nextInt();
							if(choice == 1) {
								System.out.println("변경할 정보를 선택해주세요.");
								System.out.println("직급 <1>  이메일 <2>  전화번호 <3>  주소 <4>  급여 <5> : ");
								switch(s.nextInt()) {
								case 1:
									System.out.print("변경할 직급을 입력해주세요 : ");
									employee[j].setPosition(s.next());
									System.out.print("변경되셨습니다.");
									break;
								case 2:
									System.out.print("변경할 이메일을 입력해주세요 : ");
									employee[j].setEmail(s.next());
									System.out.print("변경되셨습니다.");
									break;
								case 3:
									System.out.print("변경할 전화번호을 입력해주세요 : ");
									employee[j].setTelno(s.next());
									System.out.print("변경되셨습니다.");
									break;
								case 4:
									System.out.print("변경할 주소을 입력해주세요 : ");
									employee[j].setAddress(s.next());
									System.out.print("변경되셨습니다.");
									break;
								case 5:
									System.out.print("변경할 급여을 입력해주세요 : ");
									employee[j].setPay(s.nextInt());
									System.out.print("변경되셨습니다.");
									break;
								default:
									System.out.print("잘못입력하셨습니다. ");
									continue;
								}
							}
						else if(choice == 2) {
							System.out.println("지급받으실 월급은 "+employee[j].realPay()+"입니다.");
							continue;
						}
						else if(choice == 3) {
							choice = 0;
							a = 0;
							break;
						}else {
							System.out.println("잘못입력하셨습니다.");
							continue;
						}
						}
					}else {
						j++;
						a = 1;
					}
				if(a == 0 )
					break;
				}
				if(a == 1) {
					System.out.println("입력하신 사원이 없습니다.");
					continue;
				}
			}
			else if(choice == 2) {
				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
			
				
		}

	}

}
