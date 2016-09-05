package day008;

import java.util.Arrays;

public class Competition {

	// 创建一个算平均分的方法
	public double avg(int stu[]) {
		int sum = 0;

		// 将数组中的数累加
		for (int i : stu) {
			sum = sum + i;
		}

		// 求平均值
		double avg = (double) sum / stu.length;
		return avg;
	}

	// 创建一个算最高分的方法
	public int highest(int stu[]) {

		// 将数组升序排列
		Arrays.sort(stu);

		// 将升序后数组最后一个值给highest
		int highest = stu[stu.length - 1];

		return highest;
	}

	public static void main(String[] args) {

		int stu[] = { 85, 75, 90, 100, 65 };

		// 创建一个类的对象
		Competition competition = new Competition();

		// 打印平均成绩,调用对象的平均分方法
		System.out.println("平均成绩:" + competition.avg(stu));

		// 打印最高成绩,调用对象的求最高分方法
		System.out.println("最高成绩:" + competition.highest(stu));

	}

}
