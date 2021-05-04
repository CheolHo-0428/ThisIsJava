package sec04ex;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setT("홍길동");
		System.out.println(box.getT());
		
		Box<Integer> box1 = new Box<Integer>();
		box1.setT(123);
		System.out.println(box1.getT());

	}

}
