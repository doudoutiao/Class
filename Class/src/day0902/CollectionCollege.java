package day0902;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionCollege {

	public static void main(String[] args) {

		ArrayList<College> list = new ArrayList<>();

		College c1 = new College("�й������ѧ", "����", 81, 6);
		College c2 = new College("�Ϻ���ͨ��ѧ", "�Ϻ�", 81, 5);
		College c3 = new College("�Ͼ���ѧ", "����", 80, 6);
		College c4 = new College("�����Ƽ���ѧ", "����", 80, 5);
		College c5 = new College("��ɽ��ѧ", "�㶫", 76, 4);
		College c6 = new College("������ѧ", "����", 100, 7);
		College c7 = new College("�廪��ѧ", "����", 98, 7);
		College c9 = new College("������ѧ", "�Ϻ�", 82, 7);
		College c8 = new College("�人��ѧ", "����", 82, 6);
		College c10 = new College("�㽭��ѧ", "�㽭", 82, 5);

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		list.add(c7);
		list.add(c8);
		list.add(c9);
		list.add(c10);
	
		
		Collections.sort(list);

		for (College college : list) {
			System.out.println(college);
		}

	}

}

class College implements Comparable<College> {

	private String name;
	private String city;
	private int score;
	private int rank;

	public College(String name, String city, int score, int rank) {
		this.name = name;
		this.city = city;
		this.rank = rank;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		if(name.length()>4&&name.length()<=8)
		return name + "\t" + city + "\t" + score + "\t" + rank;
		else
		return name + "\t\t" + city + "\t" + score + "\t" + rank;
	}

	@Override
	public int compareTo(College o) {
		int num1=this.score-o.score;
		int num2=num1==0?this.rank-o.rank:num1;
		
		return -num2;
	}

}