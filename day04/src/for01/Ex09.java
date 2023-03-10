package for01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 주사위 숫자 맞추기 게임
		// 사용자에게는 3번의 기회가 주어짐
		// random으로 1~6까지의 숫자를 추출하여
		// 사용자가 3회전안에 숫자 맞추기
		
		int random = (int)(Math.random()*6)+1;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("주사위의 숫자는 몇일까요? ");
			int user = scan.nextInt();
			
			if(random == user) {
				System.out.println("축하합니다. 정답입니다");
				break;
			} else {
				if(i==3) {
					System.out.println("3번 모두 틀렸습니다. 게임오버");
				} else {
					System.out.println("틀렸습니다 다시 입력하세요");
				}
			}	
		}
	}
}
