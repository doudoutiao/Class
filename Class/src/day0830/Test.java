package day0830;

public class Test {

	public static void main(String[] args) {

		Printer printer = new Printer();
		// ´òÓ¡A4,ºÚ°×µÄÊÔ¾í
		printer.i = new GrayInkBox();
		printer.p = new A4Paper();

		printer.print();
		
		// ´òÓ¡A5,ºÚ°×ÊÔ¾í
		printer.i = new ColorfulInkBox();
		printer.print();
	}

}
