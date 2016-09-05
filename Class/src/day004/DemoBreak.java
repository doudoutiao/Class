package day004;

import java.util.Scanner;

public class DemoBreak {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++){
			
			System.out.println("请输入第"+i+"门课的成绩：");
			
			int score = input.nextInt();
			
			sum = sum + score;
			
		}
		
		double avg = sum / 5;
		System.out.println("平均分数是："+avg);
		
		input.close();
	}
}
