package day004;

public class Table {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++){
			for (int j = 1; j <=i; j++){
				int k = i * j;
				System.out.print(i+"*"+j+"="+k+"\t");
			}
			System.out.print("\n");
		}
	}
}
