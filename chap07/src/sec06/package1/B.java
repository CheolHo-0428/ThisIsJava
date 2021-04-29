package sec06.package1;

public class B {
	public void method() {
		A a = new A();		// 가능 패키지 접근 가능
		a.field = "value";	// 가능 패키지 접근 가능
		a.method();			// 가능 패키지 접근 가능
	}
}
