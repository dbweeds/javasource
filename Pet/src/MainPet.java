
public class MainPet {

	public static void main(String[] args) {
		Pet pet1 = new Pet("������",8);
		Pet pet2 = new Pet("�����",40);
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getName() + "�� "+pet1.getAge()+ "���� �Դϴ�.");
		System.out.println(pet2.getName() + "�� "+pet2.getAge()+ "���� �Դϴ�.");
		System.out.println("���� �츮�� �ֿϵ��� ���� "+Pet.getCount()+"���� �Դϴ�.");
	
	}

}
