package day006;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		
		int[] number = {8,4,2,1,23,344,12};
		int sum = 0;
		
		//��forѭ����������еĸ���ֵ����sum��ͳ�Ƹ�����֮��
		for (int i = 0; i <= number.length-1 ; i++){
			System.out.println(number[i]);	
			sum = sum + number[i];
		}
		System.out.println("������������ֵ֮����"+sum);
		
		System.out.println("������������һ�����֣�");
		
		Scanner input = new Scanner (System.in);
		int guess = input.nextInt();
		int count = 0;
		for (int i = 0; i < number.length; i++){
			if (guess == number[i]){
				System.out.println("�����а�������");
				count ++;
			}
		}
		if (count == 0){
			System.out.println("�����в���������");
		}
		
		
		input.close();
	}
}
