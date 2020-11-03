package shopping;

public class SmartTV extends Product {
	private String resolution;
	
	SmartTV(String pname,int price,String resolution){
		setPname(pname);
		setPrice(price);
		this.resolution = resolution;
		
	}
	@Override
	void printExtra() {
		System.out.println("ÇØ»óµµ : "+resolution);
	}

}
