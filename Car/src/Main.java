
public class Main {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.setSpeed(300);
		System.out.println("���� ������ : "+Car.getCount());

		
		Car myCar2 = new Car("blue");
		myCar2.setSpeed(200);
		System.out.println("���� ������ : "+Car.getCount());

		Car myCar3 = new Car("yellow",180);
		myCar3.downSpeed(100);
		System.out.println("���� ������ : "+Car.getCount());
		
		myCar1.downSpeed(80);
		System.out.println("�ڵ��� 1�� ������ "+myCar1.getColor() +", ���� �ӵ��� "+myCar1.getSpeed()+"km �Դϴ�.");
		
		myCar2.downSpeed(50);
		System.out.println("�ڵ��� 2�� ������ "+myCar2.getColor() +", ���� �ӵ��� "+myCar2.getSpeed()+"km �Դϴ�.");
		
		myCar3.upSpeed(30);
		System.out.println("�ڵ��� 3�� ������ "+myCar3.getColor() +", ���� �ӵ��� "+myCar3.getSpeed()+"km �Դϴ�.");
		
		System.out.println("���� ������ : "+Car.getCount());

	}

}
