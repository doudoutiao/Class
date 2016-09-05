package day004;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
		System.out.println("请输入学员成绩：");
		
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		if (score >= 80){
			System.out.println("成绩良好");
		}
		else if (score < 80 && score >= 60){
			System.out.println("成绩中等");
		}
		else {
			System.out.println("成绩很差");
		}
		
		input.close();
	
	}
}
