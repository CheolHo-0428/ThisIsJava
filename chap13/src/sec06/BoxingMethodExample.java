package sec06;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(123);
		int intValue = box1.getValue();

	}

}
