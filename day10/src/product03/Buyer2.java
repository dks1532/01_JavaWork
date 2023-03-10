package product03;

import java.util.ArrayList;

public class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList<Object> item = new ArrayList<Object>();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);	// ArrayList에 삽입
		System.out.println(p + "를 구입하였습니다");
	}
	
	// 반품
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 반품하였습니다");
		} else {
			System.out.println("구입한 물품중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		if(item.isEmpty()) {
			System.out.println("구입한 물품이 없습니다");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			// ArrayList의 index번호 get(index) 메서드 사용
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += p + ", ";
		}
		
		System.out.println("총 구입금액 : " + sum);
		System.out.println("구입 물품들 : " + itemList);
	}
}