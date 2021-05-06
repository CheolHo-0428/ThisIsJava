package sec04ex;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<String, String> p1 = new Pair<String, String>("홍길동", "심청이");
		Pair<String, String> p2 = new Pair<String, String>("홍길동", "심청이");
		
		boolean result1 = Util.<String, String>compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}
