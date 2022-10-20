import kr.or.kosa.TV;

public class Ex03_Method_Call {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.brandName = "LG";
		tv.printChannelAndBrandName();
		
		tv.channel = 12;
		tv.printChannelAndBrandName();
		
		tv.channelUp();tv.channelUp();tv.channelUp();
		tv.printChannelAndBrandName();
		
		tv.channelDown();tv.channelDown();
		tv.printChannelAndBrandName();
	
		
		TV stv = new TV();
		
		stv.brandName = "»ï¼º";
	}

}
