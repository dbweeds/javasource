public class Stack <T> {
	private int count;
	private T[] v;
	
	public Stack(int size) {
		v=(T[])new Object[size];
		count = 0;
	}
	
	public void push(T item) {
		v[count++] = item;
	}
	
	public T pop() {
		return v[--count];
	}
	
	public int size() {
		return count;
	}
	public static <T extends Comparable<T>>T max(T x, T y) {
		if(x.compareTo(y)>0)
			return x;
		return y;
	}
	public boolean compareSize(Stack<?> o) {
		return size() > o.size() ? true:false;
	}
}
