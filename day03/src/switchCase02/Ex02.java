package switchCase02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 5칙연산(+,-,*,/,%)
		// 3개 (숫자로 2개, 문자 1개) switch문으로
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("연산 기호 입력: ");
		String s  = sc.next();
		
		System.out.print("두번째 숫자를 입력: ");
		int num2 = sc.nextInt();
		
		switch(s) {
		case "+": 
			System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "= " + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "= " + num1 * num2);
			break;
		case "/":
			System.out.printf("%d/%d=%.2f", num1, num2, (double)num1/num2);
			break;
		case "%":
			System.out.println(num1 + "%" + num2 + "= " + num1 % num2);
			break;
		default:
			System.out.println("연산 기호가 잘못되었습니다");
		
		}
		
	}

}