package phone05;

public class PhoneTest{

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
		sp1.bell();
		sp1.sendVoice("여보세요 나는 홍길동입니다. 아무개씨 핸드폰인가요?");
		sp1.receveVoice("네 내가 아무개 입니다.");
		sp1.sendVoice("안녕히 계세요");
		sp1.hangUp();
		sp1.msg("오늘 수업은 굉장히 재미있습니다");
		sp1.kakao("선생님이 거짓말하고 있어요 나는 재미없어요");
		sp1.search("상속");
		
		CellPhone cp1 = new CellPhone();
		cp1.bell();
		cp1.sendVoice("여보세요 나는 홍길동입니다. 아무개씨 핸드폰인가요?");
		cp1.receveVoice("네 내가 아무개 입니다.");
		cp1.sendVoice("안녕히 계세요");
		cp1.hangUp();
		cp1.msg("오늘 수업은 굉장히 재미있습니다");
	}
}
