package day0901;

import java.util.Iterator;
import java.util.LinkedList;

public class DogDog2 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	

	LinkedList list=new LinkedList();

	Dog dog1 = new Dog("欧欧", "雪纳瑞");
	Dog dog2 = new Dog("亚亚", "拉布拉多");
	Dog dog3 = new Dog("菲菲", "拉布拉多");
	Dog dog4 = new Dog("美美", "雪纳瑞");
	
	list.add(dog3);
	list.add(dog1);
	list.add(dog2);
	list.add(dog4);
	
	Dog dog=(Dog) list.getFirst();
	
	System.out.println("第一条狗狗的昵称是"+dog.getName()+".");
	
	 dog=(Dog) list.getLast();
	
	System.out.println("最后一条狗狗的昵称是"+dog.getName()+".\n");
	
	list.removeFirst();
	list.removeLast();
	
	System.out.println("删除部分狗狗后还有"+list.size()+"条狗狗.");
	System.out.println("分别是:");
	Iterator it=list.iterator();
	while(it.hasNext()){
		Object obj=it.next();
		Dog d=(Dog) obj;
		System.out.println(d);
	}
	
	
}
}


