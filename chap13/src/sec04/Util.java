package sec04;

import sec02.Box;

public class Util {
	
	//메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setQuestion(t);
		return box;
	}
}
