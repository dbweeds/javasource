package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) throws Exception {
		ArrayList<CheckingAccount> account = new ArrayList<CheckingAccount>();
		account.add(new CheckingAccount("110-10-1000","김지호",5000000,"c1"));
		account.add(new CheckingAccount("110-10-1001","김지이",50000,"c2"));
		account.add(new CheckingAccount("110-10-1002","김지삼",5000,"c3"));
		account.add(new CheckingAccount("110-10-1003","김지사",100000,"c4"));
		account.add(new CheckingAccount("110-10-1004","김지오",50,"c5"));
		for(CheckingAccount e:account) {
			System.out.println(e.getName() + " " + e.getMoney());
		}
		Scanner s = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = s.next();
		CheckingAccount my = null;
		for(int i = 0 ; i < account.size();i++) {
			if(name.equals(account.get(i).getName())) {
				my = account.get(i);
			}
		}
		System.out.print("카드번호를 입력하세요 : ");
		String check = s.next();
		
		System.out.print("지불하실 금액을 입력하세요 : ");
		int pay = s.nextInt();
		int money = my.pay(check, pay);
		System.out.println("현재 잔액은" + account.get(0).getMoney()+"만원입니다.");
	}

}
