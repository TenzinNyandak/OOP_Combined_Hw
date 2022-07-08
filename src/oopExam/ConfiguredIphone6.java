package oopExam;

public class ConfiguredIphone6 extends Iphone6{
	
	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice * 1;
		System.out.println("Total price of ram and camera is " + total1);
		return total1;
	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total2 = ramPrice + cameraPrice + 1 + Integer.parseInt(processorPrice);
		System.out.println("Total price of ram camera and processor is " + total2);
		return total2;
	}

	@Override
	public void materials() {
		System.out.println("This is a void type method from Iphone6 Class");

	}

	@Override
	public void materials(int ramPrice, String processorPrice, int cameraPrice) {
		int total3 = ramPrice + 5 + Integer.parseInt(processorPrice) + cameraPrice;
		System.out.println("Total price of ram, processor and camera is " + total3);
	}

	//The final and static method from a parent class cannot be overridden by a child class.
}
