
public class EmployeeSystemin extends Employee {
	
	public EmployeeSystemin(){
		super();
	}
	public void SystemIn() {
			employee[i] = new Employee();
			System.out.print("이름 : ");
			name = s.next();
			employee[i].setName(name);
			System.out.print("성별 : ");
			sex = s.next();
			employee[i].setSex(sex);
			System.out.print("이메일 : ");
			employee[i].setEmail(s.next());
			System.out.print("생년월일(Ex:1950-01-01) : ");
			employee[i].setBirthday(s.next());
			System.out.print("전화번호 : ");
			employee[i].setTelno(s.next());
			System.out.print("주소 : ");
			employee[i].setAddress(s.next());
			System.out.print("직급 : ");
			employee[i].setPosition(s.next());
			System.out.print("급여 : ");
			employee[i].setPay(s.nextInt());
			do {
				a = 0;
				System.out.print("비밀번호 : ");
				passward =s.next();
				employee[i].setPassward(passward);
				System.out.print("비밀번호 확인 : ");
				if(!passward.equals(s.next())) {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
					a = 1;
				}
					
			}while(a == 1);
			employee[i].displayAllEmployee();
			System.out.print("저장하실려면 <1>,다시 입력하실려면 <2> : ");
			if(s.nextInt() == 1) {
				System.out.println("정보가 저장되었습니다.");
				i++;
				Employee.setCount();
				break;
			}else
				continue;
		}
		
	}
}
