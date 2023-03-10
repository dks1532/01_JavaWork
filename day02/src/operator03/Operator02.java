package operator03;

public class Operator02 {

	public static void main(String[] args) {
		
		int n1 = -20;
		n1 = +n1;
		System.out.println(n1);
		
		n1 = -n1;
		System.out.println(n1);
		
		// int / int = int , 결과적으로 몫만 나옴
		int x = 10;
		int y = 7;
		int result = x/y;
		System.out.println(result);
		
		double result2 = x/y;
		System.out.println(result2);
		
		// 실수형으로 결과를 보고싶으면 적어도 2수중 개이상은 실수형이어야 한다.
		result2 = x/(double)y;
		System.out.println(result2);
		
		// % 나머지
		result = x % y;
		System.out.println(result);
		
		x = 15;
		y = 4;

		System.out.println(x + "/" + y + "의 몫은 "+ x/y + "이고, 나머지는 " + x%y + "입니다");
	}

}
