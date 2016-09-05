package day0902;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EnglishName {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Employee e1 = new Employee("李明", '男');
		Employee e2 = new Employee("张暗", '女');

		HashMap map = new HashMap();
		map.put("Jack", e1);
		map.put("Alice", e2);

		Employee e = (Employee) map.get("Jack");
		System.out.println("Jack对应的学员姓名是" + e.getName() + ";性别是:" + e.getSex());

		Set set = map.keySet();

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Employee values = (Employee) map.get(key);
			System.out.println(values.getName() + ":" + key);

		}

	}

}

class Employee {
	private String name;
	private char sex;

	public Employee(String name, char sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return name + sex;
	}

}