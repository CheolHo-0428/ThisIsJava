package sec04;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		public void method() {
			MyFunctionalInterface fi;
			
			fi = () -> {
				System.out.println("outterField: " + outterField);
			};
			fi.method();
			
			fi = () -> {
				System.out.println("innerField: " + innerField);
			};
			fi.method();
			
		}
	}
}
