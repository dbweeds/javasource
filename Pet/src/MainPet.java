
public class MainPet {

	public static void main(String[] args) {
		Pet pet1 = new Pet("강아지",8);
		Pet pet2 = new Pet("고양이",40);
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getName() + "는 "+pet1.getAge()+ "개월 입니다.");
		System.out.println(pet2.getName() + "는 "+pet2.getAge()+ "개월 입니다.");
		System.out.println("현재 우리집 애완동물 수는 "+Pet.getCount()+"마리 입니다.");
	
	}

}
