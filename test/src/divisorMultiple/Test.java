package divisorMultiple;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Divisor di = new Divisor();
		Gcd gcd = new Gcd();
		Lcm lcm = new Lcm();
		
		while(true) {
			System.out.println("시행할 작업을 선택(1: 약수, 2: 최소공배수, 3: 최대공약수, 0: 종료) : ");
			int x = sc.nextInt();
			if(x == 0)
				break;
			
			switch(x) {
			case 1:
				di.Divisor();
				break;
			case 2:
				lcm.Lcm();
				break;
			case 3:
				gcd.Gcd();
				break;
			default:
				System.out.println("0~3까지의 숫자만 입력하세요");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}
