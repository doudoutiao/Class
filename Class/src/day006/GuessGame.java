package day006;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		
		int[] number = {8,4,2,1,23,344,12};
		int sum = 0;
		
		//用for循环输出数组中的各个值，用sum来统计各个数之和
		for (int i = 0; i <= number.length-1 ; i++){
			System.out.println(number[i]);	
			sum = sum + number[i];
		}
		System.out.println("数列中所有数值之和是"+sum);
		
		System.out.println("请任意已输入一个数字：");
		
		Scanner input = new Scanner (System.in);
		int guess = input.nextInt();
		int count = 0;
		for (int i = 0; i < number.length; i++){
			if (guess == number[i]){
				System.out.println("数列中包含此数");
				count ++;
			}
		}
		if (count == 0){
			System.out.println("数列中不包含此数");
		}
		
		
		input.close();
	}
}
