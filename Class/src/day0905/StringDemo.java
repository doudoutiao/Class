package day0905;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���:");
		String name = scanner.next();
		System.out.println("����������:");
		String password = scanner.next();

		if (password.length() < 6)
			System.out.println("���볤�Ȳ���С��6λ!");
		else
			System.out.println("ע��ɹ�!");

		// ��֤��¼
		System.out.println("���¼,�����˺�:");
		String account = scanner.next();
		System.out.println("����������:");
		String pwd = scanner.next();
		if (account.equals(name) && pwd.equals(password))
			System.out.println("��¼�ɹ�!");
		else
			System.out.println("��¼ʧ��!");

		scanner.close();
	}

}
