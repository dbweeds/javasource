package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		shop.setTitle("mr.Kim");
		shop.genUser();
		shop.genProduct();
		shop.start();
		
	}

}
