
public class Car {
	private String color;
	private int speed;
	private static int count;
	
	Car(){
		this.color = "white";
		this.speed = 0;
		count++;
	}
	Car(String color){
		this.color = color;
		this.speed = 0;
		count++;
	}
	Car(String color,int speed){
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	void setSpeed(int speed) {
			this.speed = speed;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	
	void upSpeed(int value) {
		if(this.speed + value >= 200)
			this.speed = 200;
		else if(this.speed + value <= 0)
			this.speed = 0;
		else	
			speed += value;
	}
	void downSpeed(int value) {
		if(this.speed - value >= 200)
			this.speed = 200;
		else if(this.speed - value <= 0)
			this.speed = 0;
		else
			speed -= value;
	}
	
	
	int getSpeed() {
		return speed;
	}
	String getColor() {
		return color;
	}
	
	static int getCount() {
		return count;
	}
}
