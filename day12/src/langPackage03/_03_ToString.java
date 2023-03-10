package langPackage03;

public class _03_ToString {

	public static void main(String[] args) {
		Value v1 = new Value(5);
		Value v2 = new Value(5);
		System.out.println(v1);
		System.out.println(v1.toString());
		
		Card card1 = new Card();
		Card card2 = new Card("HEART", 10);
		System.out.println(card1);
		System.out.println(card2);	
	}
}
