package for01;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 구구단 출력
		// 2단 출력
		System.out.println("5단");
		for(int i=1; i<=9; i++) {
			System.out.println("5*"+i+"="+5*i);
		}
		
		// 사용자로부터 구구단 몇단을 출력할것인지 입력받아 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단 입력 : ");
		int dan = sc.nextInt();
		
		System.out.println(dan + "단");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}
}
