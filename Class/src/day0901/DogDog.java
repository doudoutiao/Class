package day0901;

import java.util.ArrayList;

public class DogDog {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		Dog dog1 = new Dog("ŷŷ", "ѩ����");
		Dog dog2 = new Dog("����", "��������");
		Dog dog3 = new Dog("�Ʒ�", "��������");
		Dog dog4 = new Dog("����", "ѩ����");

		// ���
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		list.add(dog4);
		System.out.println("������" + list.size() + "������.");
		System.out.println("�ֱ���:");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			Dog dog = (Dog) obj;
			System.out.println(dog);
		}
		
		// ɾ��
		System.out.println("\nɾ��֮ǰ������" + list.size() + "������.\n");
		list.remove(dog1);
		list.remove(dog3);
		System.out.println("ɾ��֮����" + list.size() + "������.");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			Dog dog = (Dog) obj;
			System.out.println(dog);
		}

		// �жϼ������Ƿ��������
		if (list.contains(dog4)) {
			System.out.println("\n�����а�����������Ϣ");
		}
		
		

	}

}
/**
 * ����
 * @author Administrator
 *
 */
class Dog {
	/**
	 * ������
	 */
	private String name;
	/**
	 * ��Ʒ��
	 */
	private String brand;
	/**
	 * ��ʼ������,���빷����,��Ʒ��
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