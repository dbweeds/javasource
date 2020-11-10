
public class Ex08_05 {

	public static void main(String[] args) {
		int [] a = new int [100];
		int [] b = new int [100];
		int count,size;
		
		for(int i = 0,k = b.length-1;i < a.length;i++,k--) {
			a[i] = i * 2;
			b[i] = k * 2;
		}
		for(int i = 0;i < a.length;i++) {
			System.out.printf("%d : a=%d b=%d\n",i+1,a[i],b[i]);
		}
		System.out.println(a.length);
		System.out.println(a.length * Integer.BYTES);
	}

}
