package phone05;

public class SmartPhone extends CellPhone {
	public void kakao(String msg) {
		System.out.println("'" + msg + "'를 카톡으로 보냈습니다");
	}
	public void search(String name) {
		System.out.println("'" + name + "'을 검색합니다");
	}
}
