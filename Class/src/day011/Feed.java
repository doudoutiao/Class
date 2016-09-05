package day011;

public class Feed {
	public static void main(String[] args) {

		Doggy doggy = new Doggy("狗狗", "骨头", 60);
		Penguin penguin = new Penguin("企鹅", "鱼", 99);
		Person2 person2 = new Person2();
		person2.feed(doggy);
		person2.feed(penguin);
	}

}

class Animal2 {
	private int health;
	private String food;
	private String name;

	public Animal2(String name, String food, int health) {
		this.food = food;
		this.health = health;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health > 100) {
			this.health = 100;
		} else
			this.health = health;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void feed() {

	}

}

class Person2 {
	public void feed(Animal2 obj) {
		if (obj.getHealth() < 100) {
			obj.feed();
			System.out.println(obj.getName() + "吃" + obj.getFood() + "后健康值为"
					+ obj.getHealth());
		} else {
			System.out.println(obj.getName() + "吃" + obj.getFood() + "后健康值为"
					+ obj.getHealth());
		}

	}
}

class Doggy extends Animal2 {
	public Doggy(String name, String food, int health) {
		super(name, food, health);
	}

	public void feed() {
		super.setHealth(getHealth() + 3);
	}

}

class Penguin extends Animal2 {
	public Penguin(String name, String food, int health) {
		super(name, food, health);

	}

	public void feed() {
		super.setHealth(getHealth() + 5);
	}

}
