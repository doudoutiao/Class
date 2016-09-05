package day007;

import java.util.Scanner;

public class 三个班五名学生总成绩 {

	public static void main(String[] args) {

		// 打开扫描器
		Scanner input = new Scanner(System.in);

		// 创建数组scores[班级数][学生数],
		int[][] scores = new int[3][5];

		// 循环获取每个班每个学生的成绩
		for (int i = 0; i < 3; i++) {
			System.out.println("*******第" + (i + 1) + "个班*******");
			for (int j = 0; j < 5; j++) {
				System.out.println("请输入第" + (j + 1) + "个学生的成绩:");
				scores[i][j] = input.nextInt();
			}
		}

		System.out.println("*******成绩统计*******");

		// 循环统计每个班的总成绩并打印出结果
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++) {
				sum = sum + scores[i][j];
			}
			System.out.println((i + 1) + "班总成绩:" + sum);
		}

		input.close();
	}

}
