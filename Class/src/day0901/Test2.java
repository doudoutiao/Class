package day0901;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("java");
		list.add("hello");
		list.add("world");

		System.out.println("长度" + list.size());

		list.remove(0);

		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}

		for (Object obj : list) {
			System.out.println(obj);
		}

		// 迭代器 hasNext(),next()
		Iterator it = list.iterator();//返回迭代器对象
		
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}

	}

}
