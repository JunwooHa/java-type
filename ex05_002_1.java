package chapter05;

public class ex05_002_1 {
	public static void main(String[] args)
	{
		int[] scores = {83,90,87};
		
		System.out.println("score[0]:" + scores[0]);
		System.out.println("score[1]:" + scores[1]);
		System.out.println("score[2]:" + scores[2]);
		
		int sum = 0;
		
		for(int i=0;i<3;i++)
		{
			sum += scores[i];
		}
		System.out.println("����:" + sum);
		double avg = (double)sum / 3;
		System.out.println("���:" + avg);
	}
}