
class Stack <T> {
	private T[] v;
	private int count;
	
	public Stack (int size) {
		v =(T[]) new Object[size];
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
		
	
	

}
