package day006;


public class ц╟ещеепР {

	public static void main(String[] args) {

		int[] scores = { 16, 9, 25, 23, 90 };

		for (int j = 0; j < scores.length-1; j++) {

			for (int i = 0; i < scores.length - 1-j; i++) {
				if (scores[i] > scores[i + 1]) {
					int temp = scores[i];
					scores[i] = scores[i + 1];
					scores[i + 1] = temp;
				}
			}
		}
		
		for (int i : scores) {
			System.out.println(i);
		}
	}

}
