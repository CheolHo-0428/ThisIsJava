package sec04ex;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> a = new Pair<Integer, String>(1,"s");
		Pair<Integer, String> b = new Pair<Integer, String>(1,"홍길동");
		
		Util util = new Util();
		
		boolean result1 = Util.<Integer, String>compare(a, b);
		System.out.println(result1);

		Pair<String, String> c = new Pair<String, String>("홍길동", "심청이");
		Pair<String, String> d = new Pair<String, String>("홍길동", "심청이");
	
	}

}
