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
			System.out.println("第一单元打基础");
			break;
		case U2:
			System.out.println("第二单元可以胜任Java程序开发");
			break;
		case U3:
			System.out.println("第三单元可以胜任企业级Java开发");
			break;
		}

	}
}

enum Course {
	U1, U2, U3
}
