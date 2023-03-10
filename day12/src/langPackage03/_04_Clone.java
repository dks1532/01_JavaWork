package langPackage03;

import java.util.Arrays;

public class _04_Clone {
	public static void main(String[] args) {
		Card card1 = new Card("CLOVER", 3);
		Card card2 = (Card)card1.clone();
		
		System.out.println(card1);
		System.out.println(card2);
		
		int[] arr = {1,2,3,4,5};
		
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		// 객체생성시 뒤에 getClass()를 호출하면 클래스 이름을 호출
		Card card3 = new Card("diamond", 8);
		Class cObj = new Card().getClass();
		System.out.println(cObj);
		System.out.println(cObj.getName());
		System.out.println(cObj.toString());	
	}
}
