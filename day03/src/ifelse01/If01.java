package ifelse01;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		
		int score =93;
		
		if(score>=80) {
			System.out.println("합격입니다");
		}
			System.out.println("-----------");
		
		if(score < 60)
			System.out.println("재평가 대상입니다");
			System.out.println("-----------");
		
		if(score >= 90) {
			System.out.println("합격입니다");
			System.out.println("우수한 성적입니다");
		}
		System.out.println("============");
		
		int num = -78;
		if(num == 0)
			System.out.println("0입니다");
		
		if(num > 0) {
			System.out.println("양수입니다");
			System.out.println("0보다 큰수입니다");
		}
		
		if(num < 0) {
			System.out.println("음수입니다");
			System.out.println("0보다 작은 수입니다");
		}
		System.out.println("============");
		
		// 사용자로부터 숫자를 입력받아 홀수인지 짝수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int n = sc.nextInt();
		
		if(n % 2 == 1)
			System.out.println(n + "은(는) 홀수");
		if(n % 2 == 0)
			System.out.println(n + "은(는) 짝수");
	}

}
