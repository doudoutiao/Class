package day011;

//多态
//
//多态前提:
/**
 * 1.继承关系 2.父类引用指向子类对象 3.方法的重写
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
		System.out.println("动物吃食物");
	}
}

class Bird extends Animal1 {
	public void eat() {
		System.out.println("鸟吃食物");
	}
}

class YanZi extends Bird {
	public void eat() {
		System.out.println("燕子吃虫子");
	}
}
