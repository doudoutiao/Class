package day004;

import java.util.Scanner;

public class MyShopping {

	public static void main(String[] args) {

		System.out.println("MyShopping管理系统 > 购物结算\n");
		System.out.println("***************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("***************************************");

		String str = null;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("请输入商品编号：");
			int number = input.nextInt();
			switch (number) {

			case 1:
				System.out.println("T恤\t$245.0");
				break;
			case 2:
				System.out.println("网球鞋\t$500.0");
				break;
			case 3:
				System.out.println("网球拍\t$300.0");
				break;

			default:
				System.out.println("你个傻逼输错了");
				break;
			}
			System.out.println("是否继续（y/n）?");
			str = input.next();

		} while (str.equals("y"));

		System.out.println("程序结束");
		
		input.close();
		
	}
}
