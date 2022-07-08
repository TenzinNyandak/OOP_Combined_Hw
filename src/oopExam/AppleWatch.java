package oopExam;

/*
 *  An abstract class is a super class that cannot be instantiated.
 *  Contains both abstract and non abstract methods.
 *  Abstract method can only be defined and Non abstract methods can only be implemented
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public String color;
	
	public AppleWatch() {
		System.out.println("Default constructor from AppleWatch class");;
	}

	public void abstractClassInfo() {
		System.out.println(
				"Abstract class can inherit only one regular class or abstract class by 'extends' keyword.\nAbstract class can inherit more than one interface by 'implements' keyword.");
	}
	
	//abstract method
	public abstract void appleWatchInfo();

}
