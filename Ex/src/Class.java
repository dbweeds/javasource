import java.util.Date;
import java.util.Scanner;

public class Class {
	private String rrn;
	private String birthday;
	private String sex;
	private int age;
	boolean a;
	Scanner s = new Scanner(System.in);
	Date d = new Date();
	
	Class(){
		rrn = "";
		birthday = "";
		sex = "";
		age = 0;
	}
	
	public void start() {
		System.out.print("주민번호를 입력하세요 : ");
		rrn = s.nextLine();
		errorCheck(rrn);
		Birthday(rrn);
		Sex(rrn);
	}
	/*
	public void Age(String rrn) {
		
		if((rrn.charAt(6) =='1')||(rrn.charAt(6) =='2')) {
			age = 1900 + Integer.parseInt((String)d.charAt(26))*10
		}
		else if((rrn.charAt(6) =='3')||(rrn.charAt(6) =='4')) {
			
		}
	}*/
	
	public void Sex(String rrn) {
		if((rrn.charAt(6) =='1')||(rrn.charAt(6) =='3'))
			sex = "남";
		else if((rrn.charAt(6) =='2')||(rrn.charAt(6) =='4'))
			sex = "여";
		System.out.println("성별 : "+sex);
	}
	
	public void Birthday(String rrn) {
		System.out.print("생년월일 : ");
		if((rrn.charAt(6) =='1')||(rrn.charAt(6) =='2')) {
			birthday = birthday + "19"+rrn.charAt(0)+rrn.charAt(1)+'/'
						+rrn.charAt(2)+rrn.charAt(3)+'/'+rrn.charAt(4)+rrn.charAt(5);
		}else if((rrn.charAt(6) =='3')||(rrn.charAt(6) =='4')){
			birthday = birthday + "20"+rrn.charAt(0)+rrn.charAt(1)+'/'
					+rrn.charAt(2)+rrn.charAt(3)+'/'+rrn.charAt(4)+rrn.charAt(5);
		}
		System.out.println(birthday);
	}
	
	public void errorCheck(String rrn) {
		a = true;
		if(rrn.length() == 13){
			for(int i = 0;i < rrn.length();i++) {
				if(!((rrn.charAt(i)>='0')&&(rrn.charAt(i)<='9')))
					a = false;
			}	
			if(a != true) {
				System.out.println("주민번호 확인 : 올바르지 않는 주민등록번호");
				start();
			}
			else
				System.out.println("주민번호 확인 : 올바른 주민등록번호");
				
			
		}else {
			System.out.println("주민번호 확인 : 올바르지 않는 주민등록번호");
			start();
		}
			
	}
}
