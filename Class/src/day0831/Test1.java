package day0831;

public class Test1 {

	public static void main(String[] args) {

		Test1 test1 = new Test1();

		try {
			test1.divide(2, 0);
		} catch (ArithmeticException e) {
			System.out.println("分母不能为0");
		}
		System.out.println("程序继续运行");

	}

	public double divide(int num1, int num2) throws ArithmeticException {
		if (num2 == 0)
			throw new ArithmeticException();

		return (double) (num1 / num2);
	}
}
