package sec06;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		double avg = 0;
		
		for(int score : scores) {
			sum+=score;
		}
		
		avg = (double)sum/scores.length;
		
		System.out.println("점수 종합 = "+ sum);
		System.out.println("점수 평균 = "+ avg);
		
		String var1 = "10000";
		String var2 = "20000";
		
		int num1 = Integer.parseInt(var1);
		int num2 = Integer.parseInt(var2);
		int sum2 = num1 + num2;
		System.out.println(sum2);
		
		String a = Integer.toString(num1);
		String b = Integer.toString(num2);
		String c = a + b;
		System.out.println(c);
		
		

	}

}
