package chap11_abstraction.tv;

public class LgTv extends Tv {
	public LgTv() {
		super();
	}
	
	public LgTv(int lastChannel) {
		super(lastChannel);
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("제조사: 엘지 TV의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("제조사: 엘지 TV의 전원을 끕니다.");
	}

	@Override
	public void operate(int channel) {
		// TODO Auto-generated method stub
		this.lastChannel = channel;
		moveTo(channel);
	}

	@Override
	public void moveTo(int channel) {
		// TODO Auto-generated method stub
		System.out.println("제조사: 엘지 " + channel + "로 채널을 이동합니다.");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		super.channelUp();
		System.out.println("제조사: 엘지 채널을 증가합니다.");
	}

	@Override
	public void channelDown() {
		super.channelDown();
		System.out.println("제조사: 엘지 채널을 감소합니다.");
		// TODO Auto-generated method stub
		
	}

}
