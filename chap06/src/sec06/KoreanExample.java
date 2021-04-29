package sec06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","0000-00000000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바","1111-00000000");
		System.out.println("k1.name : " + k2.name);
		System.out.println("k1.ssn : " + k2.ssn);
	}

}
