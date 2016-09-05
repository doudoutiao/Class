package day008;

import java.util.Arrays;

public class Competition {

	// ����һ����ƽ���ֵķ���
	public double avg(int stu[]) {
		int sum = 0;

		// �������е����ۼ�
		for (int i : stu) {
			sum = sum + i;
		}

		// ��ƽ��ֵ
		double avg = (double) sum / stu.length;
		return avg;
	}

	// ����һ������߷ֵķ���
	public int highest(int stu[]) {

		// ��������������
		Arrays.sort(stu);

		// ��������������һ��ֵ��highest
		int highest = stu[stu.length - 1];

		return highest;
	}

	public static void main(String[] args) {

		int stu[] = { 85, 75, 90, 100, 65 };

		// ����һ����Ķ���
		Competition competition = new Competition();

		// ��ӡƽ���ɼ�,���ö����ƽ���ַ���
		System.out.println("ƽ���ɼ�:" + competition.avg(stu));

		// ��ӡ��߳ɼ�,���ö��������߷ַ���
		System.out.println("��߳ɼ�:" + competition.highest(stu));

	}

}
