import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int i = 0;
		int a ;
		String passward;
		String sex;
		String empNumber;
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
			System.out.print("����˻� <1>  ����Է� <2>  ���ο�<3> :");
			choice = s.nextInt();
			if(choice == 3) {
				System.out.println("���� �� ��� ���� "+Employee.getCount()+"�� �Դϴ�.");
			}
			else if(choice == 1) {
				if(i == 0) {
					System.out.println("������� �� 0���Դϴ�.");
					continue;
				}
				System.out.print("�̸��� �Է��ϼ��� : ");
				name = s.next();
				for(int j = 0;j < i;) {
					if(employee[j].getName().equals(name)) {
						a = 0;
						System.out.print("��й�ȣ�� �Է��ϼ��� : ");
						if(!employee[j].getPassward().equals(s.next())) {
							System.out.println("��й�ȣ�� Ʋ���̽��ϴ�.");
							break;
						}
						employee[j].displayBasicEmployee();
						while(true) {
							System.out.print("�������� <1>  ���ް˻� <2> ������ <3> : ");
							choice = s.nextInt();
							if(choice == 1) {
								System.out.println("������ ������ �������ּ���.");
								System.out.println("���� <1>  �̸��� <2>  ��ȭ��ȣ <3>  �ּ� <4>  �޿� <5> : ");
								switch(s.nextInt()) {
								case 1:
									System.out.print("������ ������ �Է����ּ��� : ");
									employee[j].setPosition(s.next());
									System.out.print("����Ǽ̽��ϴ�.");
									break;
								case 2:
									System.out.print("������ �̸����� �Է����ּ��� : ");
									employee[j].setEmail(s.next());
									System.out.print("����Ǽ̽��ϴ�.");
									break;
								case 3:
									System.out.print("������ ��ȭ��ȣ�� �Է����ּ��� : ");
									employee[j].setTelno(s.next());
									System.out.print("����Ǽ̽��ϴ�.");
									break;
								case 4:
									System.out.print("������ �ּ��� �Է����ּ��� : ");
									employee[j].setAddress(s.next());
									System.out.print("����Ǽ̽��ϴ�.");
									break;
								case 5:
<<<<<<< HEAD
									System.out.print("������ �޿��� �Է����ּ��� : ");
									employee[j].setPay(s.nextInt());
									System.out.print("����Ǽ̽��ϴ�.");
									break;
								default:
									System.out.print("�߸��Է��ϼ̽��ϴ�. ");
									continue;
								}
							}
						else if(choice == 2) {
							System.out.println("���޹����� ������ "+employee[j].realPay()+"�Դϴ�.");
							continue;
						}
						else if(choice == 3) {
							choice = 0;
							a = 0;
							break;
						}else {
							System.out.println("�߸��Է��ϼ̽��ϴ�.");
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
					System.out.println("�Է��Ͻ� ����� �����ϴ�.");
					continue;
				}
			}
			else if(choice == 2) {
				while(i <employee.length) {
					employee[i] = new Employee();
					System.out.print("�̸� : ");
					name = s.next();
					employee[i].setName(name);
					System.out.print("���� : ");
					sex = s.next();
					employee[i].setSex(sex);
					System.out.print("�����ȣ : ");
					empNumber = s.next();
					employee[i].setEmpNumber(empNumber);
					System.out.print("�̸��� : ");
					employee[i].setEmail(s.next());
					System.out.print("�������(Ex:1950-01-01) : ");
					employee[i].setBirthday(s.next());
					System.out.print("��ȭ��ȣ : ");
					employee[i].setTelno(s.next());
					System.out.print("�ּ� : ");
					employee[i].setAddress(s.next());
					System.out.print("���� : ");
					employee[i].setPosition(s.next());
					System.out.print("�޿� : ");
=======
									System.out.print("������ ������ �Է����ּ��� : ");
									employee[j].setPay(s.nextInt());
									System.out.print("����Ǽ̽��ϴ�.");
									break;
								default:
									System.out.print("�߸��Է��ϼ̽��ϴ�. ");
									continue;
								}
							}
						else if(choice == 2) {
							System.out.println("���޹����� ������ "+employee[j].realPay()+"�Դϴ�.");
							continue;
						}
						else if(choice == 3) {
							choice = 0;
							a = 0;
							break;
						}else {
							System.out.println("�߸��Է��ϼ̽��ϴ�.");
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
					System.out.println("�Է��Ͻ� ����� �����ϴ�.");
					continue;
				}
			}
			else if(choice == 2) {
				while(i <employee.length) {
					employee[i] = new Employee();
					System.out.print("�̸� : ");
					name = s.next();
					employee[i].setName(name);
					System.out.print("���� : ");
					sex = s.next();
					employee[i].setSex(sex);
					System.out.print("�����ȣ : ");
					empNumber = s.next();
					employee[i].setEmpNumber(empNumber);
					System.out.print("�̸��� : ");
					employee[i].setEmail(s.next());
					System.out.print("�������(Ex:1950-01-01) : ");
					employee[i].setBirthday(s.next());
					System.out.print("��ȭ��ȣ : ");
					employee[i].setTelno(s.next());
					System.out.print("�ּ� : ");
					employee[i].setAddress(s.next());
					System.out.print("���� : ");
					employee[i].setPosition(s.next());
					System.out.print("���� : ");
>>>>>>> branch 'master' of https://github.com/dbweeds/javasource.git
					employee[i].setPay(s.nextInt());
					do {
						a = 0;
						System.out.print("��й�ȣ : ");
						passward =s.next();
						employee[i].setPassward(passward);
						System.out.print("��й�ȣ Ȯ�� : ");
						if(!passward.equals(s.next())) {
							System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���. ");
							a = 1;
						}
							
					}while(a == 1);
					employee[i].displayAllEmployee();
					System.out.print("�����ϽǷ��� <1>,�ٽ� �Է��ϽǷ��� <2> : ");
					if(s.nextInt() == 1) {
						System.out.println("������ ����Ǿ����ϴ�.");
						i++;
						Employee.setCount();
						break;
					}else
						continue;
				}
				
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			
				
		}

	}

}
