package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		String mobileModel = "LG G8x";
		float  mobileWeight= 145f;
		System.out.println("Mobile Details");
		System.out.println("Mobile Model:" +mobileModel);
		System.out.println("Mobile Weight:" +mobileWeight);
		
		}

	public void sendMsg() {
		
	boolean isfullCharged = true;
	int     mobileCost  = 25000;
	
	System.out.println("Fully charged:" +isfullCharged);
	System.out.println("Mobile Cost:" +mobileCost);
	
	}
	
	public static void main(String[] args) {
		
		Mobile mb = new Mobile();
		mb.makeCall();
		mb.sendMsg();
		System.out.println("This is my Mobile");
	}
	
}