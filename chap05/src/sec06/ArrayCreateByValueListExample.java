package sec06;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] score = {83, 90, 87};
		int sum=0;
		double avg;
		
		for(int i=0; i<score.length; i++) {
			System.out.println("scores["+i+"]: " + score[i]);
			sum+=score[i];
		}
		avg = (double)sum/score.length;
		
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);

	}

}
