package scanner03;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 단어단위로 읽어옴
		/*
		 * System.out.print("주소를 입력하세요 : ");
		 * String str = scan.next(); 
		 * System.out.println("당신의 이름은 " + str + "입니다.");
		 */
		
		// 한줄로 읽어옴
		/*
		 * System.out.print("주소를 입력하세요 : "); 
		 * String str2 = scan.nextLine();
		 * System.out.println("주소 : " + str2);
		 */
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int num1 = scan.nextInt();  // int로 저장할 수 있는 변수로 선언 해줘야함
		System.out.println("두번째 숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

}