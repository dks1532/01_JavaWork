package operator03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 사용자로부터 숫자 2개를 입력받아
		// 사칙연산과(+,-,*,/) 몫, 나머지를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산할 첫번째 숫자를 입력하시오: ");
		int num1 = scan.nextInt();
		System.out.print("연산할 두번째 숫자를 입력하시오: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
		System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
		System.out.println(num1 + "*" + num2 + " = " + num1*num2);
		System.out.println(num1 + "/" + num2 + " = " + (double)num1/num2);
		System.out.println(num1 + "/" + num2 + "의 몫은 " + num1/num2);
		System.out.println(num1 + "/" + num2 + "의 나머지는 " + num1%num2);
	}

}
