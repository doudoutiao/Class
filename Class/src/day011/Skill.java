package day011;

public class Skill {

	public static void main(String[] args) {

		Dog4 dog4 = new Dog4();
		Penguin4 penguin4 = new Penguin4();

		Person4 person4 = new Person4();
		person4.say(dog4);
		person4.say(penguin4);

	}

}

class Person4 {

	public void say(Pet4 pet) {

		if (pet instanceof Dog4) {
			((Dog4) pet).special();
		} else if (pet instanceof Penguin4) {
			((Penguin4) pet).special();
		}

	}

}

class Pet4 {
}

class Dog4 extends Pet4 {

	public void special() {
		System.out.println("狗具有特有的接飞盘方法");
	}

}

class Penguin4 extends Pet4 {
	public void special() {
		System.out.println("企鹅具有特有的南极游泳方法");
	}

}
