package day009;

public class Voter {
	private static int count;// 计票器统计总票数
	private int count2;// 计票器2统计每个人投的票数
	private final static int MAX = 100; // 总票数上限
	private String name;// 存放投票名字

	// 带参构造方法,输入投票者名字
	public Voter(String name) {
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Voter.count = count;
	}

	public int getCount2() {
		return count2;
	}

	public void setCount2(int count2) {
		this.count2 = count2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMax() {
		return MAX;
	}

	// 创建投票方法
	public void vote() {

		if (count == MAX) {
			System.out.println("投票活动已经结束");
		} else {
			System.out.println("投票成功");

			count++;// 投票成功总票数加1
			count2++;// 投票成功对象的票数加1

			// 当一个对象使用了两次vote方法,则表示投了两次票,所以报错
			if (count2 == 2) {
				System.out.println("不能重复投票");
				return;
			}
			System.out.println("目前总票数:" + count + "票\n" + name + "投票数量为"
					+ count2 + "票");
		}

	}

}
