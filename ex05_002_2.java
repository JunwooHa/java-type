package chapter05;

public class ex05_002_2 {
	public static void main(String[] args)
	{
		int[] score;
		score = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0;i<3;i++)
		{
			sum1 += score[i];
		}
		System.out.println("����:" + sum1);
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("����:" + sum2);
		System.out.println();
	}
	
	public static int add(int[] score)
	{
		int sum = 0;
		
		for(int i=0;i<3;i++)
		{
			sum += score[i];
		}
		
		return sum;
	}
}
