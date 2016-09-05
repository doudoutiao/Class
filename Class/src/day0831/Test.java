package day0831;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String[] className = { "C#编程", "Java编程", "Python编程" };

		Scanner scanner = new Scanner(System.in);
		String  num = null;
		try {
			System.out.println("请输入课程代号(1~3之间的数字):");
			num = scanner.next();
			int a=Integer.valueOf(num);
			System.out.println(className[a - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("您输入的数字不在1~3之间");
			System.err.println("您输入的数字不在1~3之间");
		
		} catch(NumberFormatException e){
			System.out.println("您输入的不是整数");
			System.err.println("您输入的不是整数");
			
		}finally{
			
			System.out.println("欢迎提出建议!");
			System.err.println("欢迎提出建议!");
		}
		scanner.close();
	

	}
}
