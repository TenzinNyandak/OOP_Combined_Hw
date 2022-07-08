package oopExam;

public class Iphone2 extends Iphone1{
	
	public char userOfIphone2 = 'F';
	
	public Iphone2() {
		super();
		super.call();
		super.message();
		System.out.println("Default constructor from Iphone2 class");
	}

	public Iphone2(char userOfIphone2) {
		super.memory=150;
		this.userOfIphone2 = userOfIphone2;
		System.out.println("The memory of Iphone1 is: "+ memory);
		System.out.println("Iphone2 user: "+ userOfIphone2);	
	}
	
	public void iPhone2Info() {
		super.memory=250;
		super.camera();
		System.out.println("Iphone2Info memory: "+ memory);
	}
	
	public void iPhone2Info(char useOfIphone2) {
		super.youtube();
		System.out.println("Iphone2 user: "+ userOfIphone2);
	}
	
	public void dropbox() {
		System.out.println("dropbox feature from Iphone2 class");
	}

}
