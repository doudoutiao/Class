package day0830;

public class Test {

	public static void main(String[] args) {

		Printer printer = new Printer();
		// ��ӡA4,�ڰ׵��Ծ�
		printer.i = new GrayInkBox();
		printer.p = new A4Paper();

		printer.print();
		
		// ��ӡA5,�ڰ��Ծ�
		printer.i = new ColorfulInkBox();
		printer.print();
	}

}
