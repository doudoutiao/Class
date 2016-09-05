package day007;

import java.util.Scanner;

//创建类User
class User {
	
	//创建成员变量name和password
	String name = "admin";
	String password = "111111";
}

public class 用户名密码 {

	public static void main(String[] args) {

		// 打开扫描器
		Scanner scanner = new Scanner(System.in);

		// 创建User类的对象user
		User user = new User();

		for (;;) {
			System.out.println("请输入用户名:");
			String name = scanner.next();

			System.out.println("请输入密码:");
			String password = scanner.next();

			// 判断是否用户名和密码输入正确
			if (user.name.equals(name) && user.password.equals(password)) {

				// 如果正确,打印输入的新密码
				System.out.println("请输入新密码:");
				password = scanner.next();
				user.password = password;
				System.out.println("修改密码成功,您的新密码为:" + user.password);

				break;
			}

			// 如果不正确,打印错误信息
			else {
				System.out.println("用户名和密码不匹配!您没有权限更新管理员信息.");
				break;
			}
		}
		scanner.close();
	}

}
