
public class Main {

	public static void main(String[] args) {
		Triangle t = new Triangle(1,2,3,4,5,6);
		Rectangle r = new Rectangle(10,20,30,40);
		Circle c = new Circle(100,200,300);
		
		Geometry [] g = new Geometry[3];
		g[0] = t;
		g[1] = r;
		g[2] = c;
		
		for(Geometry e :g) {
			e.draw();
			System.out.println();
		}
		

	}

}
