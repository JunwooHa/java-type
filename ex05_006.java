package chapter05;

public class ex05_006 {
	public static void main(String[] args)
	{
		int[][] mathscore = new int[2][3];
		
		for(int i=0;i<mathscore.length;i++)
		{
			for(int k=0;k<mathscore.length;k++)
			{
				System.out.println("mathscore[" +i+ "][" +k+ "] = " + mathscore[i][k]);
			}
		}
		System.out.println();
		
		int[][] engscore = new int[2][];
		engscore[0] = new int[2];
		engscore[1] = new int[3];
		
		for(int i=0; i<engscore.length;i++)
		{
			for(int k=0;k<engscore.length;k++)
			{
				System.out.println("englishscore[" +i+ "][" +k+ "] = " + engscore[i][k]);
			}
		}
		System.out.println();
		
		int[][] javascore = {{95,80},{92,96,80}};
		
		for(int i=0; i<javascore.length;i++)
		{
			for(int k=0;k<javascore.length;k++)
			{
				System.out.println("javascore[" +i+ "][" +k+ "] = " + javascore[i][k]);
			}
		}
	}
}
