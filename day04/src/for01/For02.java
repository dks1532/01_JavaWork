package for01;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		int num = 1;
		for(int i=1; i<=100; i++) {// i=i+2
			System.out.println(num+ ". 안녕하세요");
			num += 2;
		}
		System.out.println("----------------");
		
		for(int i=50; i>=1; i--)
			System.out.println(i+". 안녕");
		System.out.println("=================");
		
		// 1~100까지 합계를 구하시오
		int sum = 0;
		int i=0;
		for(i=1; i<=100; i++) {			
			sum = sum + i;			
		}
		System.out.println(sum);
		System.out.println(i);
		System.out.println("=================");
		
		Scanner scan = new Scanner(System.in);
		/*
		for(int j=1; j<=5; j++) {
			System.out.println("이름 입력 :");
			String name = scan.next();
			System.out.println("당신의 이름은 " + name + "입니다");
		}
		
		for(int j=1; j<=3; j++) {
			System.out.println("첫번째 숫자 입력 :");
			int num1 = scan.nextInt();
			System.out.println("두번째 숫자 입력 :");
			int num2 = scan.nextInt();
			
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}
		*/
		
		// 사용자로부터 2숫자와 연산자를 입력받아 연산한 결과 출력(3번 반복)
		for(int j=1; j<=3; j++) {
			System.out.println("첫번째 숫자 입력 :");
			int num1 = scan.nextInt();
			System.out.println("두번째 숫자 입력 :");
			int num2 = scan.nextInt();
			System.out.println("연산자 입력 : ");
			String op = scan.next();

			switch(op) {
			case "+":
				System.out.println(num1 + op + num2 + "=" + (num1+num2));
				break;
			case "-":
				System.out.println(num1 + op + num2 + "=" + (num1-num2));
				break;
			case "*":
				System.out.println(num1 + op + num2 + "=" + (num1*num2));
				break;
			case "/":
				System.out.println(num1 + op + num2 + "=" + ((double)num1/num2));
				break;
			case "%":
				System.out.println(num1 + op + num2 + "=" + (num1%num2));
				break;
			default:
				System.out.println("연산자 잘못 입력. 다시 넣으세요");
			}
			/*
			if(op.equals("+"))
				System.out.println(num1 + op + num2 + "=" + (num1-num2));
			*/
			char ch = op.charAt(0);
			if(ch == '+')
				System.out.println(num1 + op + num2 + "=" + (num1+num2));
			else if(ch == '-')
				System.out.println(num1 + op + num2 + "=" + (num1-num2));

		}
	}
}






