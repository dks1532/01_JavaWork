package ifelse01;

public class Ex07 {

	public static void main(String[] args) {
		// 35도 이상이면 폭염주의보, 40도 이상이면 폭염경보
		// -10도 이하이면 한파주의보, -20도 이하이면 한파경보
		int month = 12;
		int c = -20;
		if(month>=3 && month<=5)
			System.out.println("봄입니다");
		else if(month>=6 && month<=8) {
			System.out.println("여름입니다");
			if(c >= 40)
				System.out.println("40도 이상 폭염경보");
			else if(c >= 35)
				System.out.println("35도 이상 폭염주의보");
		} 
		else if(month>=9 && month<=11)
			System.out.println("가을입니다");
		else if(month==1 || month==2 || month==12) {
			System.out.println("겨울입니다");
			if(c <= - 20)
				System.out.println("-20도 이하 한파경보");
			else if(c <= -10)
				System.out.println("-10도 이하 한파주의보");
		}
		else
			System.out.println("1~12달만 존재합니다 다시 넣으세요");

	}

}
