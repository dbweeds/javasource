
public class Main {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.setSpeed(300);
		System.out.println("현재 차량수 : "+Car.getCount());

		
		Car myCar2 = new Car("blue");
		myCar2.setSpeed(200);
		System.out.println("현재 차량수 : "+Car.getCount());

		Car myCar3 = new Car("yellow",180);
		myCar3.downSpeed(100);
		System.out.println("현재 차량수 : "+Car.getCount());
		
		myCar1.downSpeed(80);
		System.out.println("자동차 1의 색상은 "+myCar1.getColor() +", 현재 속도는 "+myCar1.getSpeed()+"km 입니다.");
		
		myCar2.downSpeed(50);
		System.out.println("자동차 2의 색상은 "+myCar2.getColor() +", 현재 속도는 "+myCar2.getSpeed()+"km 입니다.");
		
		myCar3.upSpeed(30);
		System.out.println("자동차 3의 색상은 "+myCar3.getColor() +", 현재 속도는 "+myCar3.getSpeed()+"km 입니다.");
		
		System.out.println("현재 차량수 : "+Car.getCount());

	}

}
