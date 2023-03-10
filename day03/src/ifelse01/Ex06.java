package ifelse01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 점수를 입력받아서
		/*
		70점이상이면 합격
			90점 이상이면 장학생입니다
			그 나머지는 축하합니다
		70점 미만이면 불합격
		모든 사람들에게는 고생하셨습니다
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score = sc.nextInt();
		
		if(score >= 70) {
			System.out.println("합격입니다");
			if(score >= 90)
				System.out.println("장학생입니다");
			else
				System.out.println("축하합니다");
		} else
			System.out.println("불합격입니다");
		
		System.out.println("고생하셨습니다");
		
		// 중첩 if를 이용하여 A+, A-, B+, B-
		if(score >= 90) {
			if(score >= 95)
				System.out.println("A+");
			else
				System.out.println("A-");
		} else if(score >= 80) {
			if(score >= 85)
				System.out.println("B+");
			else
				System.out.println("B-");
		}

		char ch1=' ', ch2=' ';
		if(score >= 90) {
			ch1 = 'A';
			if(score >= 95) {
				ch2 = '+';
			} else {
				ch2 = '0';
			}
		} else if(score >= 80) {
			ch1 = 'B';
			if(score >= 85)
				ch2 = '+';
			else
				ch2 = '0';
		}
		System.out.println("당신의 학점은 " + ch1 + ch2 + "입니다");
	}

}
