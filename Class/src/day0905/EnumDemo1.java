package day0905;

public class EnumDemo1 {

	public static void main(String[] args) {

		Course c = Course.U1;
		whichCourse(c);
		c = Course.U2;
		whichCourse(c);
		c = Course.U3;
		whichCourse(c);

	}

	public static void whichCourse(Course c) {

		switch (c) {
		case U1:
			System.out.println("��һ��Ԫ�����");
			break;
		case U2:
			System.out.println("�ڶ���Ԫ����ʤ��Java���򿪷�");
			break;
		case U3:
			System.out.println("������Ԫ����ʤ����ҵ��Java����");
			break;
		}

	}
}

enum Course {
	U1, U2, U3
}
