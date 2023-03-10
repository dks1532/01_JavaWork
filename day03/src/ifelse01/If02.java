package ifelse01;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 영문자(대소문자중 1개) 혹은 숫자(0~9)를 입력받아
		// 영문자이면 문자입니다
		// 숫자이면 숫자 입니다
		// 논리연산자로
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자(대소문자중 1개) 혹은 숫자(0~9)를 입력: ");
		String str = sc.next();
		char ch = str.charAt(0);
		
		if(ch >= '0' && ch <= '9')
			System.out.println("첫번째 넣은 값은 숫자입니다.");
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("첫번째 넣은 값은 문자입니다.");
	}

}
