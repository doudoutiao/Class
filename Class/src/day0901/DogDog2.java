package day0901;

import java.util.Iterator;
import java.util.LinkedList;

public class DogDog2 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	

	LinkedList list=new LinkedList();

	Dog dog1 = new Dog("ŷŷ", "ѩ����");
	Dog dog2 = new Dog("����", "��������");
	Dog dog3 = new Dog("�Ʒ�", "��������");
	Dog dog4 = new Dog("����", "ѩ����");
	
	list.add(dog3);
	list.add(dog1);
	list.add(dog2);
	list.add(dog4);
	
	Dog dog=(Dog) list.getFirst();
	
	System.out.println("��һ���������ǳ���"+dog.getName()+".");
	
	 dog=(Dog) list.getLast();
	
	System.out.println("���һ���������ǳ���"+dog.getName()+".\n");
	
	list.removeFirst();
	list.removeLast();
	
	System.out.println("ɾ�����ֹ�������"+list.size()+"������.");
	System.out.println("�ֱ���:");
	Iterator it=list.iterator();
	while(it.hasNext()){
		Object obj=it.next();
		Dog d=(Dog) obj;
		System.out.println(d);
	}
	
	
}
}


