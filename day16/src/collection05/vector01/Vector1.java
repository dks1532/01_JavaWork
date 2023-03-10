package collection05.vector01;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		Vector vector = new Vector();		// 모든 객체의 자료형을 받을 때
		ArrayList al = new ArrayList();

		List<Student> vlist = new Vector();		// 부모자료형으로 형변환, Student객체만 받을 때
		List<Student> alist = new ArrayList();

		vlist.add(new Student("홍길동", 480));	// 맨 끝에 삽입
		vlist.add(new Student("kh정보", 30));
		vlist.add(new Student("아무개", 25));
		vlist.add(new Student("이순신", 29));
		vlist.add(new Student("이율곡", 21));

		alist.add(new Student("홍길동", 480));
		alist.add(new Student("kh정보", 30));
		alist.add(new Student("아무개", 25));
		alist.add(new Student("이순신", 29));
		alist.add(new Student("이율곡", 21));

		vlist.remove(1);		// index 1을 삭제

		for (int i = 0; i < vlist.size(); i++) {
			Student student = vlist.get(i);		// index에 있는 객체 얻어오기
			System.out.println(student.getName() + "\t" + student.getStuNo());
		}
		System.out.println("--------------------");

		alist.clear();		// 모두 삭제
		if (!alist.isEmpty()) {
			for (int i = 0; i < alist.size(); i++) {
				Student student = alist.get(i);
				System.out.println(student.getName() + "\t" + student.getStuNo());
			}
		} else
			System.out.println("데이터가 없습니다");
	}
}
