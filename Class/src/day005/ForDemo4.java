package day005;

public class ForDemo4 {
	
	public static void main(String[] args) {
		
//		int sum = 0;
//		int i = 1;
//		for (; i <= 10; i++){
//			sum = sum + i;
//			if (sum > 20){
//				break;
//			}
//		}
//		System.out.println("测试："+i);
		int sum = 0;
		for (int i = 1; i <= 10; i++){
			if (i % 2 == 0){
				sum = sum + i;
			}
		}
		System.out.println("偶数之和是："+sum);
	}

}
