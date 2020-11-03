package shopping;

public class CellPhone extends Product {
	private String carrier;
	
	CellPhone(String pname,int price,String carrier){
		setPname(pname);
		setPrice(price);
		this.carrier = carrier;
		
	}
	@Override
	void printExtra() {
		System.out.println("통신사 정보 : "+carrier);

	}

}
