package sec04;

import sec02.Box;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box = Util.boxing(100);
		int intValue = box.getQuestion();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.getQuestion();
		System.out.println(strValue);
		
		

	}

}
