package day008;

public class Calculator {

	//��������add,��������a+b�ĺ�
	public int add(int a, int b) {
		return a + b;
	}
	
	//���ط���add,���ظ�����a+b�ĺ�
	public double add(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		//������ķ���
		Calculator calculator = new Calculator();
		
		//ʹ�ö���ķ�������add����ӡ���
		int a = calculator.add(1, 2);
		System.out.println(a);
		
		//ʹ�ö���ķ���������add����ӡ���
		double b = calculator.add(1, 2, 3);
		System.out.println(b);
	}

}
