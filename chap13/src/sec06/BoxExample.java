package sec06;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.setValue("홍길동");
		System.out.println(box1.getValue());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setValue(123);
		System.out.println(box2.getValue());

	}

}
