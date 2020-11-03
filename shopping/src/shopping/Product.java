package shopping;

public abstract class Product {
	private String pname;
	private int price;
	public Object getPrice;
	
	void printDetail() {
		System.out.println("��ǰ�̸� : "+pname);
		System.out.println("���� : "+price);
		printExtra();
	}
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	abstract void printExtra(); 

}
