package week1.day1;

public class Bike {

	public void applyBreak() {
		
		System.out.println("Apply break for Bike");

	}
	
	public void soundHorn() {
	
		System.out.println("Sound Horn");

	}
	
	public static void main(String[] args) {
		
		Bike bk = new Bike();
		bk.applyBreak();
		bk.soundHorn();
		
		Car cr = new Car();
		cr.applyBrake();
		cr.soundHorn();
				
	}
}