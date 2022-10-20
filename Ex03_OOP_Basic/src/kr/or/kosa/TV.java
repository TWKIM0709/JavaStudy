package kr.or.kosa;

public class TV {
	//variable
	public int channel;
	public String brandName;
	
	//method
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void printChannelAndBrandName() {
		System.out.printf("채널은 [%d] 브랜드 이름은 [%s]\n", channel,brandName);
	}
}
