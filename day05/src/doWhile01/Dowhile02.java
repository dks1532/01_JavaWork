package doWhile01;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		// 1. 랜덤으로 1~100사이의 숫자를 추출
		// 사용자가 랜덤숫자 맞추기
		// 정답 30 , 사용자 67 => 보다 작은 숫자로 다시 도전하세요
		//		  ,       25 => 보다 큰 숫자로 다시 도전하세요
		// 축하합니다 정답입니다
		// ?회만에 정답을 맞췄습니다
		int rd = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		int user = 0, i = 0;
		do {
			System.out.println("1~100사이의 숫자를 입력하세요: ");
			user = sc.nextInt();
			if(rd > user)
			System.out.println("보다 큰 숫자로 다시 도전하세요");
			else if(rd < user)
			System.out.println("보다 작은 숫자로 다시 도전하세요");
			i++;
		} while(user != rd);
		System.out.println("축하합니다 정답입니다 " + i + "회만에 정답을 맞췄습니다");
	}

}
