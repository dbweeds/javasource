
public class Triangle extends Geometry {
	private int a1;
	private int b1;
	private int a2;
	private int b2;
	
	
	public Triangle(int a, int b,int a1,int b1,int a2,int b2) {
		super(a, b);
		 this.a1= a1;
		 this.b1= b1;
		 this.a2= a2;
		 this.b2= b2;
	}

	public void draw() {
		System.out.printf("»ï°¢Çü (%d,%d),(%d,%d),(%d,%d)", a, b,a1,b1,a2,b2);
	}

}
