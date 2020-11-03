
public class Rectangle extends Geometry {
	private int hight;
	private int width;
	public Rectangle(int a, int b,int width,int hight) {
		super(a, b);
		this.hight = hight;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.printf("»ç°¢Çü (%d,%d),width = %d,hight = %d", a, b,width,hight);

	}

}
