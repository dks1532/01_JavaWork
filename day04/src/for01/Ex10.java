package for01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 1,-2 사용자 승
		// -1, 2 컴퓨터 승
		
		int com = (int)(Math.random()*3+1);
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3)중 하나의 숫자 입력 : ");
		int user = scan.nextInt();
		
		if(com == 1)
			System.out.println("컴퓨터는 가위를 냈습니다");
		else if(com==2)
			System.out.println("컴퓨터는 바위를 냈습니다");
		else
			System.out.println("컴퓨터는 보를 냈습니다");
		
		switch(user) {
		case 1:
			System.out.println("당신은 가위를 냈습니다");
			break;
		case 2:
			System.out.println("당신은 바위를 냈습니다");
			break;
		case 3:
			System.out.println("당신은 보를 냈습니다");
		}
		
		switch(user-com) {
		case 1: case -2:
			System.out.println("사용자 승");
			break;
		case -1: case 2:
			System.out.println("컴퓨터 승");
			break;
		case 0:
			System.out.println("비겼습니다");
		}

	}

}
