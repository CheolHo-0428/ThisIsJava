package sec04ex;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setT("hello");
		String str = box.getT();
		System.out.println(str);
		
		Box<Integer> box1 = new Box<Integer>();
		box1.setT(123);
		int value = box1.getT();
		System.out.println(value);

	}

}
