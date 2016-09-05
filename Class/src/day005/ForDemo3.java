package day005;

public class ForDemo3 {
	
	public static void main(String[] args) {
		
//		int i = 1; 
//		int sum = 0;
//		
//		while (i <= 100){
//			if (i % 2 == 0){
//				sum = sum +i;
//			}
//			i++;
//		}
		int sum = 0;
		for ( int i = 1; i <= 100; i ++){
			if (i % 2 == 0){
				sum = sum + i;
			}
		}
		System.out.println("偶数之后为："+sum);
	}

}
