package switchCase02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		int num = 6;
		switch(num) {
		case 1: case 6: case 7:
			System.out.println("A반");
			break;
		case 2 : case 8: case 10:
			System.out.println("B반");
			break;
		case 3 :
			System.out.println("C반");
			break;
		case 4 :
			System.out.println("D반");
			break;
		default :
			System.out.println("F반");
		}

		// 달을 입력받아
		// switch문으로 봄,여름,가을,겨울을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력: ");
		int m = sc.nextInt();
		
		switch(m) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("1~12월만 입력하시오");
		}
		// 점수를 입력받아 학점을 표기
		System.out.print("점수를 입력하시오: ");
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}