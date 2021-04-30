package sec01.exam06;

public class MyClass {
	//필드
	RemoteControl rc = new Television();
	
	//생성자
	MyClass(){}
	
	MyClass(RemoteControl rc){
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	public void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
	}
	
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
