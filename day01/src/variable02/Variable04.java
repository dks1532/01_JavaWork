package variable02;

public class Variable04 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 5); // c언어에서 printf를 사용, %d: 데시멀(10진수)
		int num = 10;
		System.out.printf("%d\n", num);
		
		System.out.printf("%f\n", 3.1545); // %f: float 실수
		
		System.out.printf("%f\n", 3.0);  // 자릿수 표시때문에 쓰고 다른 명령어는 잘 안 씀
		System.out.printf("%c\n", 'b');
		System.out.printf("%s\n", "wiakzk");
		System.out.println("-------------");
		
		System.out.format("%d\n", 5); // c언어에서 printf를 사용, %d: 데시멀(10진수)
		num = 10;
		System.out.format("%d\n", num);
		
		System.out.format("%f\n", 3.1545); // %f: float 실수
		
		System.out.format("%f\n", 3.0);  // 자릿수 표시때문에 쓰고 다른 명령어는 잘 안 씀
		System.out.format("%c\n", 'b');
		System.out.format("%s\n", "wiakzk");
		System.out.println("============");
		
		// 약간 사용하는 문법
		// 8진수로 출력
		System.out.printf("%o\n", 9);
		
		// 16진수로 출력
		System.out.printf("%x\n", 15); // %x는 소문자로 출력
		System.out.printf("%X\n", 15); // %X는 대문자로 출력
		
		System.out.printf("%6.4f\n", 1.234567); // 6.4f의 의미: 전체 6자리 숫자를 소수점아래 4자리까지만 5자리에서 반올림하여 출력 (소수점도 자리 하나를 차지함)
		System.out.printf("%7.4f\n", 12.34567);
		
		// 가장 많이 사용하는 문법
		System.out.printf("%.3f\n", 1435.346678); // %.3f: 앞의 정수자리부분은 모두 출력하고 소수점 3자리까지만 출력
		System.out.format("%.3f", 1435.346678);
	}

}