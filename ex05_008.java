package chapter05;

public class ex05_008 {
	public static void main(String[] args)
	{
		int[] old = {1,2,3};
		int[] newa = new int[5];
		
		for(int i=0;i<old.length;i++)
		{
			newa[i] = old[i];
		}
		
		for(int i=0;i<newa.length;i++)
		{
			System.out.print(newa[i] + ", ");
		}
	}
}
