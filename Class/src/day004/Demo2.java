package day004;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		System.out.println("��������λ��Ա����");
		
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
		int hundreds = number /100 %10;
		int random = (int)(Math.random()*10);
		
		if (hundreds == random){
			System.out.println("��ϲ����Ϊ�����ǵ����˻�Ա");
		}
		else {
			System.out.println("���ź���û�г�Ϊ���ǵ����˻�Ա");
		}
		
		input.close();
	}
}
