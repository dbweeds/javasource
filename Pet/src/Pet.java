
public class Pet {
	private String name;
	private int age;
	private static int count = 0;
	
	Pet(String name, int age){
		this.name = name;
		this.age = age;
		count++;
	}
	
	public void move() {
		System.out.println(name + "�� �����Դϴ�.");
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static int getCount() {
		return count;
	}
}
