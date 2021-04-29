package sec06;

public class B1 {
	
	public B1() {
		A1 a = new A1();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; //private 접근 불가
		
		a.method1();
		a.method2();
		//a.method3(); private 접근 불가
	}
	
}
