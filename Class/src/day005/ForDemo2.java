package day005;

import java.util.Scanner;

public class ForDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("������һ������");
		
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
		for (int i = 0; i <= number; i++){
			System.out.println(i+" + "+(number-i)+" = "+number);
		}
		
		input.close();
	}

}
