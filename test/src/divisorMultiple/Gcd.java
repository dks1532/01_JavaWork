package divisorMultiple;

import java.util.Scanner;

public class Gcd {
	Scanner sc = new Scanner(System.in);
	
	public void Gcd() {
		System.out.println("첫번째 숫자 입력 : ");
		int x = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int y = sc.nextInt();
		
		int small = (x < y) ? x : y;
		int gcd = 0;
		for(int i = 1; i<=small; i++) {
			if(x % i == 0 && y % i ==0)
				gcd = i;
		}
		System.out.printf("%d와 %d의 최대공약수: %d\n",x,y,gcd);
	}
}
