package kr.or.iei.projectname;

import phone05.SmartPhone;
import tv.Tv;

public class Test {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.power();
		SmartPhone sp = new SmartPhone();
		sp.kakao("카톡보내기");
		sp.search("접근제한자");
	}
}
