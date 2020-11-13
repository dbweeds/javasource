package basic;

/*
 * 클래스 : 틀,설계도, 객체를 생성하는데 사용
 * 객체 : 유형, 무형
 * 
 * 인스턴스화 : 클래스로부터 객체를 만드는 과정
 * 인스턴스 : 어떤 클래스로부터 만들어진 객체
 * 
 * 객체 == 인스턴스
 * 
 * 책상은 객체다.
 * 책상은 책상 클래스의 인스턴스다
 * 
 * 객체 구성요소 - 속성, 기능
 * 속성 - 멤버변수,필드,property
 * 기능 - 메소드,함수
 */
public class TV {
	//속성 - 전원상태,크기,색상,볼륨,채널
	//기능 - 전원켜기,끄기, 볼륨 업 다운,채널 업 다운
	private String color;
	private int volume;
	private int channel;	
	private boolean power;
	
	//생성자  - 클래스 이름과 동일하게 작성/리턴 차입은 없음/접근제한자
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
