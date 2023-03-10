package casting02;

public class Promotion01 {

	public static void main(String[] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// 자동 형변환: 작은 타입 -> 큰 타입에 넣을때
		// 자동으로 형이 변환되어 들어간다
		float num3 = num2;
		long num4 = num1;
		
		// 값이 넘어서면 이상한 값이 나온다
		int result = num1 * num2;
		System.out.println(result);
		
		byte b1 = 40;
		short sh1 = b1;
		
		char ch = 'H';
		int num5 = ch;
		num5 = b1;
		num5 = sh1;
		
		double dou1 = ch;
		dou1 = num5;
		dou1 = b1;
		dou1 = sh1;
	}

}
