package day006;

import java.util.Scanner;

public class �ļҵ������ֻ��۸� {

	public static void main(String[] args) {

		System.out.println("������4�ҵ�ļ۸�");
		
		//��ɨ����
		Scanner input = new Scanner(System.in);

		//��������price�����������ļ۸�
		int[] price = new int[4];
		
		//��ɨ����ѭ����������ļ۸񲢷���price����
		for (int i = 1; i <= 4; i++) {
			System.out.println("��" + i + "��ļ۸�");
			price[i - 1] = input.nextInt();
		}

		//������Сֵ����min���Ȱ�price����ĵ�һ������ֵ��min
		int min = price[0];
		
		//ѭ���ж�price�������Ƿ�����С��min�������������ֵ��min
		for (int i = 0; i < price.length; i++) {
			if (price[i] < min) {
				min = price[i];
			}
		}
		
		System.out.println("��͵ļ۸���" + min);

		input.close();

		
		
	}

}
