package sec04;

public class UsingLocalVariable {
	public void method(int arg) {
		int localVar = 40;
		
		MyFunctionalInterface fi;
		
		fi = ()->{
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
