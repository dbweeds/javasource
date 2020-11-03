
public class Map<T,V> {
	private T[] key;
	private V[] value;
	private int count;
	
	public Map(int size) {
		key = (T[])new Object[size];
		value = (V[])new Object[size];
		count = 0;
	}
	public void push(T t,V v) {
		key[count] = t;
		value[count] = v;
		count++;
		
	}
	public V get(T t) {
		for(int i=0;i < count;i++) {
			if(key[i].equals(t)) {
				return value[i];
			}		
		}
		return null;
	}
	public int size() {
		return count;
	}

}
