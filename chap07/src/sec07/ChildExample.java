package sec07;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		Parent PC = new Child();
		Child PCC = (Child)PC;
			
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		parent.method1();
		parent.method2();
		
		System.out.println();
		
		PC.method1();
		PC.method2();
		PCC.method3();
		

	}

}
