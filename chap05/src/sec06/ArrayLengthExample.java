package sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum=0;
		double avg=0;
		int Leng = scores.length;
		
		for(int i=0; i<Leng; i++) {
			sum+=scores[i];
		}
		
		avg = (double)sum/Leng;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);

	}

}
