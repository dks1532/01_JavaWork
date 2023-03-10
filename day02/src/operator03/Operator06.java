package operator03;

import java.util.Scanner;

public class Operator06 {

	public static void main(String[] args) {
		// 삼항연산자
		// 조건식 ? 식1 : 식2
		
		int a = 10;
		int b = 5;
		int result = a > b ? a : b ;
		System.out.println(result);
		
		// 사용자로부터 2수를 입력받아서 더 큰 숫자를 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("비교할 첫번째 숫자를 입력하시오: ");
		int x = sc.nextInt();
		System.out.print("비교할 두번째 숫자를 입력하시오: ");
		int y = sc.nextInt();
		
		System.out.println(x == y ? "두 숫자가 같습니다" : (x > y ? x : y));
		
		// 사용자로부터 숫자 1개 입력받아
		// 짝수, 홀수인지 출력하기
		Scanner sc1 = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num1 = sc1.nextInt();
		
		System.out.println(num1 % 2 == 1 ? num1 + "은(는) 홀수": num1 + "은(는) 짝수");
	}

}
