package day01;

public class Char01 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041'; // u: 유니코드를 의미
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println("-------");
		
		char ch4 = '가';
		char ch5 = 44032;
		char ch6 = '\uac00';
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		int unicode = '정';
		System.out.println(unicode);
		
		char ch7 = 'a' + + 1; // 리터럴에서는 사용가능
		System.out.println("마지막 : " + ch7);
		
		// char ch8 = ch7 + 1;  오류
		
		int ch8 = 'A' + 'B';
		System.out.println(ch8);
	}

}
