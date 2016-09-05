package day0901;

import java.util.ArrayList;

public class DogDog {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		Dog dog1 = new Dog("欧欧", "雪纳瑞");
		Dog dog2 = new Dog("亚亚", "拉布拉多");
		Dog dog3 = new Dog("菲菲", "拉布拉多");
		Dog dog4 = new Dog("美美", "雪纳瑞");

		// 添加
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		list.add(dog4);
		System.out.println("共计有" + list.size() + "条狗狗.");
		System.out.println("分别是:");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			Dog dog = (Dog) obj;
			System.out.println(dog);
		}
		
		// 删除
		System.out.println("\n删除之前共计有" + list.size() + "条狗狗.\n");
		list.remove(dog1);
		list.remove(dog3);
		System.out.println("删除之后还有" + list.size() + "条狗狗.");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			Dog dog = (Dog) obj;
			System.out.println(dog);
		}

		// 判断集合中是否包含美美
		if (list.contains(dog4)) {
			System.out.println("\n集合中包含美美的信息");
		}
		
		

	}

}
/**
 * 狗类
 * @author Administrator
 *
 */
class Dog {
	/**
	 * 狗名字
	 */
	private String name;
	/**
	 * 狗品种
	 */
	private String brand;
	/**
	 * 初始化狗类,输入狗名字,狗品种
	 * @param name
	 * @param brand
	 */
	public Dog(String name, String brand) {
		this.brand = brand;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return name + "\t" + brand;
	}

}