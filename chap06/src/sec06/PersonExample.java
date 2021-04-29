package sec06;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/*
		p1.nation = "Japna";      //final 필드는 갑 수정 불가
		p1.ssn = "00000-000000";
		*/
	}

}
