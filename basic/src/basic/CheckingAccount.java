package basic;

public class CheckingAccount extends Account {
	private String cardNo;
	public CheckingAccount(String account, String name, int money, String cardNo) {
		super(account, name, money);
		this.cardNo = cardNo;
		}
	
	public int pay(String cardNo, int money) throws Exception {
		if((this.cardNo.equals(cardNo)) && (super.money>money)){
			super.money -= money;
			//System.out.println("지불하신 금액은 "+money+"원이고 현재 잔액은 "+super.money+"원 입니다.");
			return super.money;
		}else if(this.cardNo != cardNo) {
			throw new Exception("카드번호를 확인해주세요");
		}else {
			throw new Exception("잔액이 부족합니다.");
		}
	}


}
