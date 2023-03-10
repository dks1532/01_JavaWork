package product03;

public class ProductTest {
	public static void main(String[] args) {
		//Buyer b = new Buyer();
		Buyer2 b = new Buyer2();
		Computer com = new Computer();
		Tv tv = new Tv();
		Audio audio = new Audio();
		Game game = new Game();
		
		b.buy(com);
		b.buy(tv);
		b.buy(audio);
		b.summary();
		System.out.println();
		
		b.refund(audio);
		b.summary();
		System.out.println();
		
		b.buy(game);
		b.buy(com);
		b.buy(game);
		
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("보너스 포인트 : " + b.bonusPoint);
	}
}
