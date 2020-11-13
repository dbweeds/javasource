package basic;

public class Account {
	protected String account;
	private String name;
	public String getName() {
		return name;
	}
	protected int money;
	public Account(String account, String name, int money) {
		super();
		this.account = account;
		this.name = name;
		this.money = money;
	}
	public void addMoney(int money) {
		this.money += money;
	}
	public void downMoney(int money) throws Exception {
		if(this.money < money ) {
			throw new Exception("잔액이 부족합니다.");
		}else {
			this.money -= money;
		}
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	
	

}
