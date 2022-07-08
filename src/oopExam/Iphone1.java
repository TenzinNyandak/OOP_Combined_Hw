package oopExam;


public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public int memory;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public Iphone1() {
		System.out.println("Default constructor from Iphone1 class");
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println("Parameterized constructor from Iphone1 class");
	}

	public void regularClassInfo() {
		System.out.println(
				"Regular class can inherit only one regular class or abstract class by 'extends' keyword.\nRegular class can inherit more than one interface by 'implements' keyword.");
	}

	public static void youtube() {
		System.out.println("youtube feature from Iphone1 class");
	}

	@Override
	public void pager() {
		System.out.println("pager feature from Pager interface");
	}

	@Override
	public void wakitoki() {
		System.out.println("wakitoki feature from Wakitoki interface");
	}

	@Override
	public void watch() {
		System.out.println("watch feature from Watch interface");
	}

	@Override
	public void digitalWatch() {
		System.out.println("digitalWatch feature from DigitalWatch interface");
	}

	@Override
	public void interfaceInfo() {
		System.out.println("interfaceInfo feature from Phone interface");
	}

	@Override
	public void call() {
		System.out.println("call feature from Phone interface");
	}

	@Override
	public void message() {
		System.out.println("message feature from Phone interface");
	}

	@Override
	public void camera() {
		System.out.println("camera feature from Phone interface");
	}

	@Override
	public void appleWatchInfo() {
		System.out.println("appleWatchInfo feature from AppleWatch abstract class");
	}

}
