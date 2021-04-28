package Intro.ex01;

public class PersonExample {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name="최민지";
		person1.age = 11;
		System.out.println("person1 이름: " + person1.name);
		System.out.println("person1 나이: " + person1.age);
		person1.setPhoneNumber("010-2699-0857");
		System.out.println("person1 전화번호: " + person1.getPhoneNumber());
		System.out.println();
		
		Person person2 = new Person("조철호","010-000-1234", 10, "againnr@naver.com");
		person2.returnName();
		person2.returnAge();
		System.out.println("person2 전화번호: " + person2.getPhoneNumber());
		
	}
}
