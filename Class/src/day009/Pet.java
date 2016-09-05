package day009;

public class Pet {

	private int love;
	private int health;

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if (love < 0 || love > 100) {
			System.out.println("亲密度应该在0-100之间,默认值为60");
			this.love = 60;
		} else {
			this.love = love;
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0 || health > 100) {
			System.out.println("亲密度应该在0-100之间,默认值为60");
			this.health = 60;
		} else {
			this.health = health;
		}
	}

}
