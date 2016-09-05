package day009;

public class TestVoter {

	public static void main(String[] args) {

		//创建对象张三
		Voter zhang = new Voter("张三");
		//投票
		zhang.vote();
		
		Voter li = new Voter("李四");
		li.vote();
		
		Voter wang = new Voter("王五");
		wang.vote();

		//循环创建97个对象张i,每个对象使用一次投票方法
		for (int i = 1; i <= 97; i++) {
			Voter voter = new Voter("张" + i);
			voter.vote();
		}
		
		//第101人投票显示结果投票结束
		Voter voter = new Voter("张98");
		voter.vote();

	}

}
