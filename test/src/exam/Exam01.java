package exam;

import java.util.Arrays;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] personArr = new String[5];
		
		for(int i = 0; i < personArr.length; i++) {
			// 원인 : 1. for문에서 조건식의 길이를 얻어오는 length()메소드이므로 괄호를 없애야 한다.
			System.out.print(i+1 + "번째 주민번호 입력 : ");
			// 원인 : 2. System.out.print(i + "번째 주민번호 입력 : "); 에서 i는 0부터 시작하므로 1부터하려면 i+1을 해줘야 한다.
			String personId = sc.nextLine();
				if(personId.length() == 14) {
					char gender = personId.charAt(7);
					// 원인 : 3. charAt() 은 index번호를 사용하므로 8을 7로 해야 원하는 값을 가져올 수 있다
					if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
						// 원인 : 4. 자료형이 문자를 받아 저장하기 때문에 외따옴표를 붙여 줘야한다. 현재는 숫자를 의미한다.
						personArr[i] = personId.substring(0, 8) + "******";
					} else {
						System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
						i--;
						// 원인 : 5. else 블럭 각각 해당 반복차수가 다시 돌아가야 하기 때문에 for의 증감식에서 1 증가할거에 대비해 미리 1감소시켜야 한다.
					}
				} else {
					System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
					--i;
				}
			}
		System.out.println("--- 주민번호 정보 등록 완료 ---");
		System.out.println(Arrays.toString(personArr));
	}

}
/* 조치내용
 * 1. for(int i = 0; i < personArr.length; i++)
 * 2. System.out.print(i+1 + "번째 주민번호 입력 : ");
 * 3. char gender = personId.charAt(7);
 * 4. if(gender == '1' || gender == '2' || gender == '3' || gender == '4')
 * 5. else {
			System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
			--i;
		}
 */