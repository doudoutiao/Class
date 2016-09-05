package day0831;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("input a number");
			num1 = scanner.nextInt();
			
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.exit(1);
		}finally{
			System.out.println("finally");
		}

		int num2 = scanner.nextInt();
		System.out.println(num2+num1);
		
		scanner.close();

	}

}
