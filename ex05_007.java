package chapter05;

public class ex05_007 {
	public static void main(String[] args)
	{
		String[] array = new String[3];
		array[0] = "java";
		array[1] = "java";
		array[2] = new String("java");
		
		System.out.println(array[0] == array[1]);
		System.out.println(array[0] == array[2]);
		System.out.println(array[0].equals(array[2]));
	}
}
