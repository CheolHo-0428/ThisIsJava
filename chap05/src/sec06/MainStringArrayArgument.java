package sec06;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String var1 = args[0];
		String var2 = args[1];
		
		int num1 = Integer.parseInt(var1);
		int num2 = Integer.parseInt(var2);
		int sum = num1 + num2;
		
		System.out.println(num1+"+"+num2+"="+sum);

	}

}
