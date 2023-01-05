package tvtesk;

public class BasicTv
{	// 필드
	// 색상
	// 가격
	// power // on off 논리
	// channel = 1;
	
	String color;
	int price;
	boolean power;
	int channel = 1;
	
	// 생성자 컨쉬에스 오	
	public BasicTv(String color, int price, boolean power, int channel) {
		super();
		this.color = color;
		this.price = price;
		this.power = power;
		this.channel = channel;
	}

	//메소드 (기능)
	// powerOnOff
	void powerOnOff()
	{
		power = !power;
	}
		
	// channelUp
	int channelUp()
	{
		return ++channel; 
	}
	
	// channelDown
	int channelDown()
	{
		return --channel;
	}
	
}
