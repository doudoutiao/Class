package day007;

import java.util.Scanner;

//������User
class User {
	
	//������Ա����name��password
	String name = "admin";
	String password = "111111";
}

public class �û������� {

	public static void main(String[] args) {

		// ��ɨ����
		Scanner scanner = new Scanner(System.in);

		// ����User��Ķ���user
		User user = new User();

		for (;;) {
			System.out.println("�������û���:");
			String name = scanner.next();

			System.out.println("����������:");
			String password = scanner.next();

			// �ж��Ƿ��û���������������ȷ
			if (user.name.equals(name) && user.password.equals(password)) {

				// �����ȷ,��ӡ�����������
				System.out.println("������������:");
				password = scanner.next();
				user.password = password;
				System.out.println("�޸�����ɹ�,����������Ϊ:" + user.password);

				break;
			}

			// �������ȷ,��ӡ������Ϣ
			else {
				System.out.println("�û��������벻ƥ��!��û��Ȩ�޸��¹���Ա��Ϣ.");
				break;
			}
		}
		scanner.close();
	}

}
