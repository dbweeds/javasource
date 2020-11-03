
public class DateMain {

	public static void main(String[] args) {
		
		Date myDate2 = new Date();
		
		myDate2.displayDate();
		
		System.out.println(myDate2.getYear()+"-"+myDate2.getMonth()+"-"+myDate2.getDay());
		
		
		Date myDate = new Date(2020, 11, 31);
		
		myDate.displayDate();
		
		System.out.println(myDate.getYear()+"-"+myDate.getMonth()+"-"+myDate.getDay());
	}

}
