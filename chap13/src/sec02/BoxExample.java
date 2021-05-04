package sec02;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.setQuestion("제니릭 타입");
		System.out.println(box.getQuestion());

	}

}
