package variable02;

public class Variable03 {

	public static void main(String[] args) {
		// 2가지는 잘 사용하지는 않음
		byte by1 = 127;
		System.out.println(by1);
		
		short sh = 30000;
		System.out.println(sh);
		
		// 문자의 유니코드 얻어내기: char를 숫자로만 표시되는 int로 형변환하여 유니코드를 알아냄
		char ch1 = '가';
		int chInt = ch1;
		System.out.println("'가'의 유니코드 : " + chInt);
		
		double dou1 = 5/3.0;
		System.out.println(dou1);

	}

}
