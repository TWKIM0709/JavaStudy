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
		System.out.printf("ä���� [%d] �귣�� �̸��� [%s]\n", channel,brandName);
	}
}
