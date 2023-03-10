package student04;

public class Student {
	String name;
	int stuNum;
	int grade = 1;
	String major;
	String className;

	void className(String className1) {
		className = className1;
	}
	int gradeUp() {
		++grade;
		return grade;
	}
	String nameChange(String name1) {
		name = name1;
		return name;
	}
	
}
