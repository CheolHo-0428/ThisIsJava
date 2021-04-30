package sec02;

public class MyClass {
	//필드
	private RemoteControl rc;
	
	//생성자
	MyClass(RemoteControl rc){
		this.rc = rc;
	}
	
	
	//메소드
	public RemoteControl getRc() {
		return rc;
	}

	public void setRc(RemoteControl rc) {
		this.rc = rc;
	}

	
	void methodA() {
		//로컬 변수
		RemoteControl rc = new Audio();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		
	}
	
	public static void main(String[] args) {
		MyClass my = new MyClass(new Television());
		my.methodB(new Audio());
	
	}
}
