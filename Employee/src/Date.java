public class Date {
	private int year;
	private int month;
	private int day;
	private int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date() {
		year = 1950;
		month = 1;
		day = 1;
		System.out.printf("Date(%d,%d,%d)\n",year,month,day);
	}
	
	public Date (int yy,int mm,int dd) {
		setDate(yy, mm, dd);
		System.out.println("Date (int yy,int mm,int dd)");
	}
	
	public void setDate(int yy,int mm,int dd) {
		year = max(yy,1950);
		month = max(mm,1);
		month = min(mm,12);
		day = max(dd,1);
		day = min(dd,days[month - 1]);
	}
	
	public void setYear(int yy) {
		year = max(yy,1950);
	}
	
	public void setMonth(int mm) {
		month = max(mm,1);
		month = min(mm,12);
	}
	
	public void setDay(int dd) {
		day = max(dd,1);
		day = min(dd,days[month - 1]);
	}
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	private int max(int x,int y) {
		if(x > y) 
			return x;
		else
			return y;
	}
	private int min(int x,int y) {
		if(x < y) 
			return x;
		else
			return y;
	}
	public void displayDate() {
		System.out.printf("%04d-%02d-%02d\n",year,month,day);
	}
}
