package day0905;

import java.util.Random;

//Random
/*
 * 构造方法
 * 		Random()
 * 		以系统时间作为随机种子产生随机数
 * 		Random(long seed)
 * 		以给定的值,作为随机种子
 * 
 * 方法
 * 		nextInt()
 * 		获取int范围内的种子
 * 		nextInt(10)
 * 		获取[0,10)之间的整数
 * 
 */

public class RandomDemo {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		Random random = new Random(10);

		for (int i = 0; i < 5; i++) {
			// int num=random.nextInt();
			int num = random.nextInt();
			System.out.println(num);
		}
	}

	public static void test() {
		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			// int num=random.nextInt();
			int num = random.nextInt(2);
			System.out.println(num);
			
		}

	}
}
