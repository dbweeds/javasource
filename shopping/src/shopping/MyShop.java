package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	
	User [] user = new User [2];//사용자
	Product[] products =  new Product [10];//등록 상품 정보
	ArrayList <Product> cart = new ArrayList<Product>();//장바구니
	private Scanner s = new Scanner(System.in);//키보드 입력
	private int selUser;
	private String title;//쇼핑몰이름
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		user[0] = new User("김일",PayType.CARD);
		user[1] = new User("김이",PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("아이폰12",120,"LG");
		products[1] = new CellPhone("아이폰11",100,"KT");
		products[2] = new CellPhone("아이폰10",80,"SKT");
		products[3] = new CellPhone("아이폰8",60,"헬로모바일");
		products[4] = new CellPhone("아이폰7",40,"우체국");
		products[5] = new SmartTV("삼성티비",250,"QHD");
		products[6] = new SmartTV("엘지티비",300,"QHD");
		products[7] = new SmartTV("화웨이티비",120,"FHD");
		products[8] = new SmartTV("삼성티비",150,"FHD");
		products[9] = new SmartTV("엘지티비",100,"FHD");
	}

	@Override
	public void start() {
		//시작하든 메서드
		String userChoise;
		
		System.out.println(title + " : 메인 화면- 계정 선택");
		System.out.println("=========================");
		for(int i = 0; i < user.length;i++) {
			System.out.printf("[%d]%s(%s)\n",i,user[i].getName(),user[i].getPaytype());
		}
		System.out.printf("[x]종 료\n");
		System.out.print("선택 : ");
		userChoise = s.next();
		switch (userChoise) {
		case "0":case "1":
			System.out.printf("## %s선택 ##\n",userChoise);
			selUser = Integer.parseInt(userChoise);
			productsList();
			break;
		case "x":case "X":	
			System.out.println("시스템을 종료합니다.");
			break;
		default:
			System.out.println("입력값을 확인해주세요.");
		}
		
	}
	public void productsList() {
		String productsChoise;
		System.out.println(title + " : 상품 목록- 상품 선택");
		System.out.println("=========================");
		
			for(int i = 0; i < products.length;i++) {
				System.out.printf("[%d]",i);
				products[i].printDetail();
			}
			System.out.printf("[h]메인 화면\n");
			System.out.printf("[c]체크 아웃\n");
			System.out.print("선택 : ");
			productsChoise = s.next();
			System.out.printf("## %s선택 ##\n",productsChoise);
			switch(productsChoise) {
			case "0": case "1": case "2": case "3": 
			case "4": case "5": case "6": case "7": 
			case "8": case "9":
				cart.add(products[ Integer.parseInt(productsChoise)]);
				productsList();
				break;
				
			case "h":
				start();
				break;
			case "c":
				checkout();
				break;
			default:
				System.out.println("입력값을 확인해주세요.");
				productsList();
			}
	}
	void checkout() {
		System.out.println(title + " : 체크아웃");
		System.out.println("=========================");
		//Product [] a= (Product[]) cart.toArray();
		int result = 0;
		int i = 0;
		/*for(;i<cart.size();i++) {
			Product p = cart.get(i)
			System.out.printf("[%d]%s(%s)\n",i++,a[i].getPname(),a[i].getPrice());
			result += a[i].getPrice();
		}*/
		for(Product p :cart) {
			System.out.printf("[%d]%s(%s)\n",i++,p.getPname(),p.getPrice());
			result += p.getPrice();
		}
		System.out.println("=========================");
		System.out.println("결제 방법 : "+ user[selUser].getPaytype());
		System.out.println("합계 : "+result+"만원 입니다.");
		System.out.println("[p]이전 , [q]견제 완료");
		System.out.print("선택 : ");
		String choise = s.next();
		if(choise.equals("p")) 
			productsList();
		else if(choise.equals("q"))
			System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
		else {
			System.out.println("입력값을 확인해주세요.");
			checkout();
		}



	}
}


