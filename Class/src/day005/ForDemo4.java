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
//		System.out.println("���ԣ�"+i);
		int sum = 0;
		for (int i = 1; i <= 10; i++){
			if (i % 2 == 0){
				sum = sum + i;
			}
		}
		System.out.println("ż��֮���ǣ�"+sum);
	}

}
