package divisorMultiple;

import java.util.Scanner;

public class Divisor {
	Scanner sc = new Scanner(System.in);

	public void Divisor() {
		System.out.println("약수를 구할 숫자를 입력 : ");
		int x = sc.nextInt();
		System.out.print(x + "의 약수: ");
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
