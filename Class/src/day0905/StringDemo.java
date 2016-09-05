package day0905;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String name = scanner.next();
		System.out.println("请输入密码:");
		String password = scanner.next();

		if (password.length() < 6)
			System.out.println("密码长度不能小于6位!");
		else
			System.out.println("注册成功!");

		// 验证登录
		System.out.println("请登录,输入账号:");
		String account = scanner.next();
		System.out.println("请输入密码:");
		String pwd = scanner.next();
		if (account.equals(name) && pwd.equals(password))
			System.out.println("登录成功!");
		else
			System.out.println("登录失败!");

		scanner.close();
	}

}
