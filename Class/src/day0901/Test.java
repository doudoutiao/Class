package day0901;

import java.util.ArrayList;

public class Test {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		News n1 = new News("���˽���", "xf", 1003);
		News n2 = new News("����", "zjy", 1004);
		News n3 = new News("����թƭ", "zjy", 1005);

		// ���
		list.add(n1);
		list.add(n2);
		list.add(n3);
		//�鿴����;
//		System.out.println(list);
		// ɾ��
//		list.remove(n2);
//		list.remove(0);
//		
//		//���ϳ���
//		list.size();
//		list.clear();
//		list.get(0);
		for(int i=0;i<list.size();i++){
			Object obj=list.get(i);
			System.out.println(obj);
		}
	
	}

}

class News {

	private String title;
	private String author;
	private int id;

	public News(String title, String author, int id) {
		this.author = author;
		this.id = id;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", author=" + author + ", id=" + id
				+ "]";
	}
	

}
