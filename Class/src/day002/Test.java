package day002;
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("����������4λ���˺ţ�");
		
		Scanner input = new Scanner (System.in);
		int accountNumber = input.nextInt(); 
		
		while (accountNumber < 1000 || accountNumber >= 10000 ){
			System.out.println("�����˺�������������������");
			accountNumber = input.nextInt();
		}
		System.out.println("��Ŀ�����"+accountNumber);
		
		input.close();
	}
}
