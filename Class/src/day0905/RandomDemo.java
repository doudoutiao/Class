package day0905;

import java.util.Random;

//Random
/*
 * ���췽��
 * 		Random()
 * 		��ϵͳʱ����Ϊ������Ӳ��������
 * 		Random(long seed)
 * 		�Ը�����ֵ,��Ϊ�������
 * 
 * ����
 * 		nextInt()
 * 		��ȡint��Χ�ڵ�����
 * 		nextInt(10)
 * 		��ȡ[0,10)֮�������
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
