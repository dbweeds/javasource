package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	
	User [] user = new User [2];//�����
	Product[] products =  new Product [10];//��� ��ǰ ����
	ArrayList <Product> cart = new ArrayList<Product>();//��ٱ���
	private Scanner s = new Scanner(System.in);//Ű���� �Է�
	private int selUser;
	private String title;//���θ��̸�
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		user[0] = new User("����",PayType.CARD);
		user[1] = new User("����",PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("������12",120,"LG");
		products[1] = new CellPhone("������11",100,"KT");
		products[2] = new CellPhone("������10",80,"SKT");
		products[3] = new CellPhone("������8",60,"��θ����");
		products[4] = new CellPhone("������7",40,"��ü��");
		products[5] = new SmartTV("�ＺƼ��",250,"QHD");
		products[6] = new SmartTV("����Ƽ��",300,"QHD");
		products[7] = new SmartTV("ȭ����Ƽ��",120,"FHD");
		products[8] = new SmartTV("�ＺƼ��",150,"FHD");
		products[9] = new SmartTV("����Ƽ��",100,"FHD");
	}

	@Override
	public void start() {
		//�����ϵ� �޼���
		String userChoise;
		
		System.out.println(title + " : ���� ȭ��- ���� ����");
		System.out.println("=========================");
		for(int i = 0; i < user.length;i++) {
			System.out.printf("[%d]%s(%s)\n",i,user[i].getName(),user[i].getPaytype());
		}
		System.out.printf("[x]�� ��\n");
		System.out.print("���� : ");
		userChoise = s.next();
		switch (userChoise) {
		case "0":case "1":
			System.out.printf("## %s���� ##\n",userChoise);
			selUser = Integer.parseInt(userChoise);
			productsList();
			break;
		case "x":case "X":	
			System.out.println("�ý����� �����մϴ�.");
			break;
		default:
			System.out.println("�Է°��� Ȯ�����ּ���.");
		}
		
	}
	public void productsList() {
		String productsChoise;
		System.out.println(title + " : ��ǰ ���- ��ǰ ����");
		System.out.println("=========================");
		
			for(int i = 0; i < products.length;i++) {
				System.out.printf("[%d]",i);
				products[i].printDetail();
			}
			System.out.printf("[h]���� ȭ��\n");
			System.out.printf("[c]üũ �ƿ�\n");
			System.out.print("���� : ");
			productsChoise = s.next();
			System.out.printf("## %s���� ##\n",productsChoise);
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
				System.out.println("�Է°��� Ȯ�����ּ���.");
				productsList();
			}
	}
	void checkout() {
		System.out.println(title + " : üũ�ƿ�");
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
		System.out.println("���� ��� : "+ user[selUser].getPaytype());
		System.out.println("�հ� : "+result+"���� �Դϴ�.");
		System.out.println("[p]���� , [q]���� �Ϸ�");
		System.out.print("���� : ");
		String choise = s.next();
		if(choise.equals("p")) 
			productsList();
		else if(choise.equals("q"))
			System.out.println("## ������ �Ϸ�Ǿ����ϴ�. �����մϴ�. ##");
		else {
			System.out.println("�Է°��� Ȯ�����ּ���.");
			checkout();
		}



	}
}


