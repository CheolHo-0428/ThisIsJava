package sec05;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable;
		
		runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		runnable.run();

	}

}
