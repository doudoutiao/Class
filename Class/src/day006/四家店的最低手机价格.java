package day006;

import java.util.Scanner;

public class 四家店的最低手机价格 {

	public static void main(String[] args) {

		System.out.println("请输入4家店的价格：");
		
		//打开扫描器
		Scanner input = new Scanner(System.in);

		//创建数组price用来存放输入的价格
		int[] price = new int[4];
		
		//用扫描器循环接收输入的价格并放入price数组
		for (int i = 1; i <= 4; i++) {
			System.out.println("第" + i + "店的价格：");
			price[i - 1] = input.nextInt();
		}

		//创建最小值变量min，先把price数组的第一个数赋值给min
		int min = price[0];
		
		//循环判断price数组中是否有数小于min的数，如果有则赋值给min
		for (int i = 0; i < price.length; i++) {
			if (price[i] < min) {
				min = price[i];
			}
		}
		
		System.out.println("最低的价格是" + min);

		input.close();

		
		
	}

}
