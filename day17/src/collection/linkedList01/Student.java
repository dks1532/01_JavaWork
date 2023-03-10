package collection.linkedList01;

public class Student {
	private String name;
	private int stuNo;

	public Student() {
	}

	public Student(String name, int stuNo) {
		super();
		this.name = name;
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
		
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuNo=" + stuNo + "]";
	}
}
