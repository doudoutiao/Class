package day007;

import java.util.Scanner;

class Traveler{
	String name;
	int age;
	
	void show(){
		if(age<15){
			System.out.println(name+"的年龄为"+age+",门票免费");
		}else{
			System.out.println(name+"的年龄为"+age+",门票20");
		}
	}
}

public class 景区门票 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Traveler traveler = new Traveler();
		for(;;){
			System.out.print("请输入姓名:");
			String name = scanner.next();
			if (name.equals("n")){
				break;
			}
			System.out.print("请输入年龄:");
			int age = scanner.nextInt();
			traveler.name=name;
			traveler.age=age;
			traveler.show();
			
		}
		scanner.close();
	}

}
