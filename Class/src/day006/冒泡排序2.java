package day006;

import java.util.Scanner;

public class ð������2 {
	
	public static void main(String[] args) {
		
		System.out.println("������5��ѧԱ�ĳɼ�:");
		Scanner input = new Scanner(System.in);
		int scores[] =new int[5];
		for(int i = 0;i<5;i++){
			scores[i]=input.nextInt();
		}
		
		for(int i=0;i<scores.length-1;i++){
			for(int j=0;j<scores.length-1-i;j++){
				if (scores[j]<scores[j+1]){
					int temp = scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=temp;
				}
			}
		}
		
		System.out.println("ѧԱ�ɼ�����������:");
		
		for(int i :scores){
			System.out.print(i+"\t");
		}
		input.close();
	}

}
