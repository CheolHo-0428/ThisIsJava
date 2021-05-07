package sec06;

public class Util {
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setValue(t);
		return box;
	}
	
}
