
public interface IStack <T> {
	<T extends Comparable<T>>T min(T x,T y);
	public void push(T item);
	public T pop();
	public int size() ;
}
