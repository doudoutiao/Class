package day006;

import java.util.Scanner;

public class 冒泡排序2 {
	
	public static void main(String[] args) {
		
		System.out.println("请输入5名学员的成绩:");
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
		
		System.out.println("学员成绩按将序排列:");
		
		for(int i :scores){
			System.out.print(i+"\t");
		}
		input.close();
	}

}
