package day004;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
		System.out.println("������ѧԱ�ɼ���");
		
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		if (score >= 80){
			System.out.println("�ɼ�����");
		}
		else if (score < 80 && score >= 60){
			System.out.println("�ɼ��е�");
		}
		else {
			System.out.println("�ɼ��ܲ�");
		}
		
		input.close();
	
	}
}
