package student04;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.className("프로그래밍 언어활용");
		System.out.println("강좌명: " + st1.className);
		
		int grade = st1.gradeUp();
		System.out.println(grade + "학년");
		
		System.out.println("이름: " + st1.nameChange("홍길동"));
		
		st1.stuNum = 20210101;
		st1.major = "IT학과";
		System.out.println("학번: " + st1.stuNum);
		System.out.println("학과: " + st1.major);
		
		Student[] st = new Student[100];
		// int count = 20230101;
		for(int i=0; i<st.length; i++) {
			st[i] = new Student();
			st[i].stuNum = 20230101+i;
			// st[i].stuNum = count++;
			System.out.println(st[i].stuNum);
		}
	}
}
