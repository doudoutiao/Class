package day011;

//��̬
//
//��̬ǰ��:
/**
 * 1.�̳й�ϵ 2.��������ָ��������� 3.��������д
 */
public class Demo2 {

	public static void main(String[] args) {
		//
		YanZi y = new YanZi();
		y.eat();
		//
		Bird b = new YanZi();
		b.eat();
		//
		Animal1 an = new YanZi();
		an.eat();

	}
}

class Animal1 {
	void eat() {
		System.out.println("�����ʳ��");
	}
}

class Bird extends Animal1 {
	public void eat() {
		System.out.println("���ʳ��");
	}
}

class YanZi extends Bird {
	public void eat() {
		System.out.println("���ӳԳ���");
	}
}
