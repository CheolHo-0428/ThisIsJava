package sec07.car;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotaion;			//누적 회전수 1증가
		if(accumulatedRotaion<maxRotation) {
			System.out.println(location + " KumhoTire 수명: " +
					(maxRotation-accumulatedRotaion) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
	
	
}
