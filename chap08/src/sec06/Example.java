package sec06;

public class Example {

	public static void main(String[] args) {
		ImplementationC C = new ImplementationC();
		
		InterfaceA A = C;
		A.methodA();
		System.out.println();
		
		InterfaceB B = C;
		B.methodB();
		System.out.println();
		
		C.methodA();
		C.methodB();
		C.methodC();

	}

}
