package day008;

public class Calculator {

	//创建方法add,返回整型a+b的和
	public int add(int a, int b) {
		return a + b;
	}
	
	//重载方法add,返回浮点型a+b的和
	public double add(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		//创建类的方法
		Calculator calculator = new Calculator();
		
		//使用对象的方法整型add并打印结果
		int a = calculator.add(1, 2);
		System.out.println(a);
		
		//使用对象的方法浮点型add并打印结果
		double b = calculator.add(1, 2, 3);
		System.out.println(b);
	}

}
