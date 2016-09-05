package day003;
import java.util.Scanner;


public class Demo2 {

		public static void main(String[] args) {
			
			System.out.println("请输入4位会员卡号：");
			
			//通过扫描器接收输入卡号
			Scanner input = new Scanner(System.in);
			int cardNumber = input.nextInt();
			
			int a = cardNumber %10;			//卡号个位数
			int b = (cardNumber /10) %10;	//卡号十位数
			int c = (cardNumber /100) %10;	//卡号百位数
			int d = cardNumber /1000;		//卡号千位数
					
			//计算卡号各位之和
			int sum = a +b +c +d;
			
			System.out.println("四位卡号之和是："+sum);
			
			//三目运算符判断是否中奖并输出结果
			String str = sum > 20 ? "您中奖了！奖品是MP3":"很遗憾你没有中奖";
			System.out.println("会员卡号"+cardNumber+"的会员,"+str);
			
			input.close();
		}
		
} 



