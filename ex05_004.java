package chapter05;

public class ex05_004 {
	public static void main(String[] args)
	{
		int[] score = {83,90,87};
		
		int sum = 0;
		for(int i=0;i<score.length;i++)
		{
			sum += score[i];
		}
		System.out.println("ÃÑÇÕ:" + sum);
		
		double avg = (double)sum/score.length;
		System.out.println("Æò±Õ:" + avg);
	}
}
