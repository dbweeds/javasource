
public class Circle extends Geometry {
	private int radius;
	public Circle(int a, int b,int radius) {
		super(a, b);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf("»ç°¢Çü (%d,%d),radius = %d", a, b,radius);

	}

}
