package day0901;

import java.util.HashSet;

public class Test3 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Person p1 = new Person("张三",1001);
		Person p2 = new Person("小三",1001);
		Person p3=p1;
		int hash1=p1.hashCode();
		int hash2=p2.hashCode();
		System.out.println(hash1+","+hash2);
		System.out.println(p1.equals(p2));
		
		HashSet hs = new HashSet();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		System.out.println(hs);
		
		
		
	}

}

class Person{
	private String name;
	private int id;
	
	public Person(String name,int id){
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
	
}