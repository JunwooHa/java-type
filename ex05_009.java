package chapter05;

import java.util.Arrays;

public class ex05_009 {
	public static void main(String[] args)
	{
		String[] old = {"java","array","copy"};
		String[] newa = new String[5];
		
		System.arraycopy(old, 0, newa, 0, old.length);
		
		newa = Arrays.copyOf(old, 5);
		
		for(int i=0;i<newa.length;i++)
		{
			System.out.print(newa[i] + ", ");
		}
	}
}
