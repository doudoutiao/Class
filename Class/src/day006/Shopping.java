package day006;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		
		System.out.println("�������Ա���µ����Ѽ�¼");
		
		Scanner input = new Scanner (System.in);
		
		double[] amount;
		amount = new double[5];
		double sum = 0;
		
		for (int i = 1; i <= 5; i++){
			System.out.println("�������"+i+"�ʹ�����");
			amount[i-1] = input.nextDouble();
			sum = sum + amount[i-1];
		}
		
		System.out.println("���\t\t���");
		
		for (int j = 1; j <= 5; j++){
			System.out.println(j+"\t\t"+amount[j-1]);
		}
		System.out.println("�ܽ��\t\t"+sum);

		input.close();
	}
}
