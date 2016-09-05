package day006;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		
		System.out.println("请输入会员本月的消费记录");
		
		Scanner input = new Scanner (System.in);
		
		double[] amount;
		amount = new double[5];
		double sum = 0;
		
		for (int i = 1; i <= 5; i++){
			System.out.println("请输入第"+i+"笔购物金额");
			amount[i-1] = input.nextDouble();
			sum = sum + amount[i-1];
		}
		
		System.out.println("序号\t\t金额");
		
		for (int j = 1; j <= 5; j++){
			System.out.println(j+"\t\t"+amount[j-1]);
		}
		System.out.println("总金额\t\t"+sum);

		input.close();
	}
}
