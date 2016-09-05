package day011;

public class Demo3 {
	public static void main(String[] args) {
		Cat cat = new Cat("小黑", 2, 59);
		Dog dog = new Dog("旺财", 3, 80);
		Fox fox = new Fox("哈利", 3, 30);

		Person person = new Person();
		person.cure(cat);
		person.cure(dog);
		person.cure(fox);
	}

}

class Person {
	public void cure(Animal an) {
		if (an.getHealth() < 60) {
			an.setHealth(60);
		}
		System.out.println(an.getName() + "健康值:" + an.getHealth());
	}

}

class Animal {
	private int age;
	private int health;
	private String name;

	public Animal() {

	}

	public Animal(int age, int health, String name) {
		this.health = health;
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Cat extends Animal {

	public Cat(String name, int age, int health) {
		super(age, health, name);
	}
}

class Dog extends Animal {
	public Dog(String name, int age, int health) {
		super(age, health, name);
	}
}

class Fox extends Animal {
	public Fox(String name, int age, int health) {
		super(age, health, name);
	}
}
