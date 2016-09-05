package day0831;

import java.util.Scanner;

public class ClassPractice {

	public static void main(String[] args) {

		String[] className = { "C#���", "Java���", "Python���" };

		Scanner scanner = new Scanner(System.in);
		String num = null;

		for (;;) {
			try {
				System.out.println("������γ̴���(1~3֮�������):");
				num = scanner.next();
				int a = Integer.valueOf(num);
				System.out.println(className[a - 1]);
				break;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("����������ֲ���1~3֮��");

			} catch (NumberFormatException e) {
				System.out.println("������Ĳ�������");

			}
		}

		System.out.println("��ӭ�������!");
		scanner.close();
	}

}
