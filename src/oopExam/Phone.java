package oopExam;

/*
 * Interface is a blueprint of a class which cannot be instantiated.
 * It contains only abstract methods which can only be defined but not implemented.
 * It contains default and static method which are non abstract(exception).
 */

public interface Phone extends Pager, Wakitoki {
	
	public static final String brand = "apple";
	
	/*
	 * Interface cannot have constructor because the variables are constant and
	 * it does not have the instance variables
	 */
		
	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a default method from phone interface");
	}

	public static void wireless() {
		System.out.println("wireless is a static from phone interface");
	}

}
