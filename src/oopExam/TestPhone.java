package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		
		System.out.println("\n-------Regular Class Iphone1-------\n");
		
		Iphone1 ip1 = new Iphone1();
		ip1.regularClassInfo();
		Iphone1.youtube();
		ip1.pager();
		ip1.wakitoki();
		ip1.watch();
		ip1.digitalWatch();
		ip1.interfaceInfo();
		ip1.call();
		ip1.message();
		ip1.camera();
		ip1.abstractClassInfo();
		ip1.appleWatchInfo();
		ip1.battery();
		
		Iphone1 ip01 = new Iphone1(750, "2000", 'M', false);
		System.out.println("I bought this phone in " + ip01.getInfo() + ", the price was $" + ip01.getPrice()
				+ ", user's sex: " + ip01.getUser() + ", made in USA: " + ip01.isMadeInUSA());

		System.out.println("\n-------Regular Class Iphone2-------\n");
		
		Iphone2 ip2 = new Iphone2();
		ip2.iPhone2Info();
		ip2.dropbox();
		Iphone2 ip02 = new Iphone2('F');
		ip02.iPhone2Info('M');


		System.out.println("\n-------Abstract Class AppleWatch-------\n");
		
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.appleWatchSeries5();
		appleWatch.watch();
		appleWatch.digitalWatch();

		System.out.println("\n-------Interface Phone-------\n");
		
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.battery();
		Phone.wireless();
		phone.pager();
		phone.wakitoki();

		System.out.println("\n-------Regular Class Iphone6-------\n");
		
		Iphone6 ip6 = new Iphone6();
		ip6.compass();
		ip6.materials(70, 400);
		ip6.materials(100, 300, "200");
		ip6.materials();
		ip6.materials(50, "300", 80);
		ip6.materials(1, 2, 3);
		Iphone6.materials(4, 5, 6, 7);
		ip6.email();
		ip6.photos();
		ip6.iPhone2Info();
		ip6.iPhone2Info('M');
		ip6.dropbox();
		ip6.regularClassInfo();
		Iphone6.youtube();
		ip6.pager();
		ip6.wakitoki();
		ip6.interfaceInfo();
		ip6.call();
		ip6.message();
		ip6.camera();
		ip6.battery();
		ip6.abstractClassInfo();
		ip6.appleWatchInfo();
		ip6.watch();
		ip6.digitalWatch();
		ip6.appleWatchSeries5();

		System.out.println("\n-------Regular Class ConfiguredIphone6-------\n");
		
		ConfiguredIphone6 c6 = new ConfiguredIphone6();
		c6.compass();
		c6.materials(70, 400);
		c6.materials(100, 300, "200");
		c6.materials();
		c6.materials(50, "300", 80);
		c6.materials(2, 4, 8);
		ConfiguredIphone6.materials(1, 3, 5, 7);
		c6.email();
		c6.photos();
		c6.iPhone2Info();
		c6.iPhone2Info('M');
		c6.dropbox();
		c6.regularClassInfo();
		ConfiguredIphone6.youtube();
		c6.pager();
		c6.wakitoki();
		c6.interfaceInfo();
		c6.call();
		c6.message();
		c6.camera();
		c6.battery();
		c6.abstractClassInfo();
		c6.appleWatchInfo();
		c6.watch();
		c6.digitalWatch();
		c6.appleWatchSeries5();

		/*
		  The relation between Ipnone1, Ipnone2, Ipnone3, Ipnone4, Ipnone5 and Iphone6
		  is an example of multilevel inheritance, i.e., Iphone6 extends Iphone5,
		  Iphone5 extends Iphone4, Iphone4 extends Iphone2, and Iphone2 extends
		  Iphone1.
		 */
		
		/*
		  The relation between Ipnone1, Iphone2 and Iphone3 is an example of
		  hierarchical inheritance, i.e., both Iphone2 and Iphone3 are derived from the
		  parent class Iphone1.
		 */
		
		/*
		  The relation between Ipnone1 and Iphone2 is an example of single inheritance,
		  i.e., Iphone2 extends Iphone1.
		 */

	}
}
