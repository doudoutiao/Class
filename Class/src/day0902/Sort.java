package day0902;

import java.util.ArrayList;

public class Sort {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ArrayList<Graduate> list = new ArrayList<Graduate>();
		
		Graduate g1 = new Graduate("AAA", 100);
		
	}

}

class Graduate{
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int score;
	
	public Graduate(String name,int score){
		this.name=name;
		this.score=score;
	}
}