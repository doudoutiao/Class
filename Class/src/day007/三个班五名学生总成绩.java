package day007;

import java.util.Scanner;

public class ����������ѧ���ܳɼ� {

	public static void main(String[] args) {

		// ��ɨ����
		Scanner input = new Scanner(System.in);

		// ��������scores[�༶��][ѧ����],
		int[][] scores = new int[3][5];

		// ѭ����ȡÿ����ÿ��ѧ���ĳɼ�
		for (int i = 0; i < 3; i++) {
			System.out.println("*******��" + (i + 1) + "����*******");
			for (int j = 0; j < 5; j++) {
				System.out.println("�������" + (j + 1) + "��ѧ���ĳɼ�:");
				scores[i][j] = input.nextInt();
			}
		}

		System.out.println("*******�ɼ�ͳ��*******");

		// ѭ��ͳ��ÿ������ܳɼ�����ӡ�����
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++) {
				sum = sum + scores[i][j];
			}
			System.out.println((i + 1) + "���ܳɼ�:" + sum);
		}

		input.close();
	}

}
