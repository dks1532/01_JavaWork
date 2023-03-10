package variable02;

public class Variable01 {

	public static void main(String[] args) {
		// 정수
		int number;
		number = 25;
		
		int number2 = 30;  // 리터럴: 변수를 선언하면서 동시에 값을 넣음
		
		System.out.println(number+number2);
		
		int result = number + number2;
		System.out.println(result);
		System.out.println(result*3);
		System.out.println(result/5);
		System.out.println(result*number);
		System.out.println("----------------");
		
		number = 100;
		number2 = 200;
		System.out.println(result);
		int result2 = number + number2;
		System.out.println(result2);
		System.out.println(result+result2);
	}

}
