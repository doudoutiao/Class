package day007;

import java.util.Scanner;

class Traveler{
	String name;
	int age;
	
	void show(){
		if(age<15){
			System.out.println(name+"������Ϊ"+age+",��Ʊ���");
		}else{
			System.out.println(name+"������Ϊ"+age+",��Ʊ20");
		}
	}
}

public class ������Ʊ {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Traveler traveler = new Traveler();
		for(;;){
			System.out.print("����������:");
			String name = scanner.next();
			if (name.equals("n")){
				break;
			}
			System.out.print("����������:");
			int age = scanner.nextInt();
			traveler.name=name;
			traveler.age=age;
			traveler.show();
			
		}
		scanner.close();
	}

}
