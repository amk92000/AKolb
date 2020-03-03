/** 
*The purpose of this class is to model a television
*Adam Kolb March 3, 2020
*/

public class Television{
	//Constants
	//Maker of TV
	private final String MANUFACTURER;
	//Size of TV
	private final int SCREEN_SIZE;
	
	//Remaining
	//TV on or off
	boolean powerOn;
	//channel number
	int channel;
	//Volume level
	int volume;
	
	Television (String manu , int ss){
		MANUFACTURER = manu;
		SCREEN_SIZE = ss;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	public int getVolume() {
		return volume;
	}
	public int getChannel() {
		return channel;
	}
	public String getManufacturer() {
		return MANUFACTURER;
	}
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	public void setChannel(int chooseChannel) {
		channel = chooseChannel;
	}
	public void power() {
		powerOn = !powerOn;
	}
	public void increaseVolume() {
		volume = volume + 1;
	}
	public void decreaseVolume() {
		volume = volume -1;
	}
	
	
}