package day009;

public class TestPet {

	public static void main(String[] args) {

		Pet pet = new Pet();
		pet.setHealth(50);
		pet.setLove(-10);

		System.out.println("健康值为" + pet.getHealth() + ",亲密度为" + pet.getLove());

	}

}
