package product02;

public class Product {
	int price;	// 사는물품의 가격
	int bonusPoint;	// 사는물품의 10%를 보너스 줌
	
	Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
}
