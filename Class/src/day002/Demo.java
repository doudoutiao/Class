package day002;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("请输入4位会员卡号");
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		System.out.println("会员卡号是："+num);
		input.close();
		
		/*
		String studentName = "小明";
		String className = "Java";
		String hobby = "篮球";
		int age = 25;
		int workYear = 3;
		int projectNumber = 5;
		
		System.out.println("这个同学的姓名是："+studentName);
		System.out.println("年龄是："+age);
		System.out.println("工作了"+workYear+"年了");
		System.out.println("做过"+projectNumber+"个项目");
		System.out.println("技术方向是"+className);
		System.out.println("兴趣爱好是："+hobby);
		*/
		
		/*
		final double PI = 3.14;
		int r = 4; //半径
		double s = PI * (r*r);
		System.out.println("圆的面积为："+s);
		*/
		
	}

}