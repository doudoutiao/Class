package day004;

public class DemoSwitch {
	
	public static void main(String[] args) {
		
		int mingci = 3;
		
		switch (mingci) {
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");
			
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			
			break;

		default:
			System.out.println("没有任何奖励");
			break;
		}
	}

}
