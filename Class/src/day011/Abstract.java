package day011;

public class Abstract {
	public static void main(String[] args) {

	}

}

abstract class Animal3 {

	public abstract void eat();

}

abstract class Bird3 extends Animal3 {
	String name;
	int age;

	public Bird3(String name, int age) {
		this.age = age;
		this.name = name;

	}

}

class CrazyBird extends Bird3 {
	public CrazyBird(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {

		System.err.println("≥‘÷Ì");
	}

}