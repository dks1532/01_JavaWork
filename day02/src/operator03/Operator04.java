package operator03;

public class Operator04 {

	public static void main(String[] args) {
		// 논리연산자
		// && : 조건이 모두다 참일때만 참
		// || : 조건이 1개라도 참이 있으면 참
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1>20 && num2>5); // 둘다 참이어야 참
		System.out.println(num1>20 || num2>5); // 1개만 참이어도 참
		System.out.println("---------------");
		
		int num3 = 10;
		System.out.println(num1<20 && num2>5 && num3<15);
		System.out.println(num1<20 || num2>5 || num3>15);
		System.out.println("---------------");
		
		// ! : not
		boolean bool = true;
		bool = !bool;
		System.out.println(bool);

		char ch = ']';
		
		bool = ch < 'C';
		System.out.println(bool);
		System.out.println("---------------");
		
		System.out.println((ch>='A') && (ch<='Z'));
		System.out.println((ch>='a') && (ch<='z'));
		System.out.println((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'));
	}

}
