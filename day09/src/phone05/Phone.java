package phone05;

public class Phone {
	// 공통으로 들어가는 전화 받기, 전화걸기
	void bell() {
		System.out.println("따르릉 따르릉");
	}
	void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}
	void receveVoice(String msg) {
		System.out.println("상대방 : " + msg);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}

}
