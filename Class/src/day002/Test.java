package day002;
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("请输入您的4位数账号：");
		
		Scanner input = new Scanner (System.in);
		int accountNumber = input.nextInt(); 
		
		while (accountNumber < 1000 || accountNumber >= 10000 ){
			System.out.println("您的账号输入有误请重新输入");
			accountNumber = input.nextInt();
		}
		System.out.println("你的卡号是"+accountNumber);
		
		input.close();
	}
}
