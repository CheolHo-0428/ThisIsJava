package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum=0;
		
		while(sum!=5) {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.println("("+num1+","+num2+")");
			sum = num1 + num2;
		}

	}

}
