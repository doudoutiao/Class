package day004;

import java.util.Scanner;

public class MyShopping {

	public static void main(String[] args) {

		System.out.println("MyShopping����ϵͳ > �������\n");
		System.out.println("***************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("***************************************");

		String str = null;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("��������Ʒ��ţ�");
			int number = input.nextInt();
			switch (number) {

			case 1:
				System.out.println("T��\t$245.0");
				break;
			case 2:
				System.out.println("����Ь\t$500.0");
				break;
			case 3:
				System.out.println("������\t$300.0");
				break;

			default:
				System.out.println("���ɵ�������");
				break;
			}
			System.out.println("�Ƿ������y/n��?");
			str = input.next();

		} while (str.equals("y"));

		System.out.println("�������");
		
		input.close();
		
	}
}
