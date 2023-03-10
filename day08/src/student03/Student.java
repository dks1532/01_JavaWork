package student03;

public class Student {
	static String class1;
	
	int stuNum;
	String name;
	String addr;
	String subName;
	
	String subjectName(String subName) {
		this.subName = subName;
		return this.subName;
	}
	
	static void totalCount(int tCount) {
		System.out.println("현재 수강인원 : " + tCount);
	}
}
