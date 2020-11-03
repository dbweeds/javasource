public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setAllEmployee();
		
		Intrance hello=new Intrance(book);
		while(hello.outloop!=1) {
			hello.tryIn();
		}
	}

}
