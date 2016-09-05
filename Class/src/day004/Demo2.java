package day004;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		System.out.println("请输入四位会员卡号");
		
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
		int hundreds = number /100 %10;
		int random = (int)(Math.random()*10);
		
		if (hundreds == random){
			System.out.println("恭喜您成为了我们的幸运会员");
		}
		else {
			System.out.println("很遗憾您没有成为我们的幸运会员");
		}
		
		input.close();
	}
}
