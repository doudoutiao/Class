package day003;
import java.util.Scanner;


public class Demo2 {

		public static void main(String[] args) {
			
			System.out.println("������4λ��Ա���ţ�");
			
			//ͨ��ɨ�����������뿨��
			Scanner input = new Scanner(System.in);
			int cardNumber = input.nextInt();
			
			int a = cardNumber %10;			//���Ÿ�λ��
			int b = (cardNumber /10) %10;	//����ʮλ��
			int c = (cardNumber /100) %10;	//���Ű�λ��
			int d = cardNumber /1000;		//����ǧλ��
					
			//���㿨�Ÿ�λ֮��
			int sum = a +b +c +d;
			
			System.out.println("��λ����֮���ǣ�"+sum);
			
			//��Ŀ������ж��Ƿ��н���������
			String str = sum > 20 ? "���н��ˣ���Ʒ��MP3":"���ź���û���н�";
			System.out.println("��Ա����"+cardNumber+"�Ļ�Ա,"+str);
			
			input.close();
		}
		
} 



