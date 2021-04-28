package Intro.ex01;

public class Person {
	
	//필드
	public String name;
	private String phoneNumber;
	int age = 1;
	private String email;
	
	//필드 값 할당은 메소드 안에서만 줄 수 있다. 또는 처음에 같이 선언해야 한다.
	
	
	//생성자	
	public Person() {
		System.out.println("기본 생성자를 생성함");
	}
	
	public Person(String name, String phoneNumber, int age, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.email = email;
		System.out.println("옵션 생성자를 생성함");
	}
	
	//메소드
	// 반환값(리턴타입)이 있는 메소드; return 실행문이 포함됨
	// 반환값(리턴타입)이 없는 메소드; return 실행문이 포함될 수도 있고 안될 수도 있음
	public int returnAge() {
		int myAge = this.age;
		System.out.println("person2 나이: " + myAge);
		return myAge; //명시된 값을 호출한 메소드에 반환하고 이 메소드를 종료한다.	
	}
	
	public void returnName() {
		System.out.println("person2 이름:" + this.name);
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
