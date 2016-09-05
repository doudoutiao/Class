package day0830;

public class Printer {

	String name="我的打印机";
	
	Paper p;
	InkBox i;
	
	public void print(){
		System.out.println("用"+p.size()+","+i.color()+"打印纸张");
	}

}
