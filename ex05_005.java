package chapter05;

public class ex05_005 {
	public static void main(String[] args)
	{
		if(args.length != 2)
		{
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strnum1 = args[0];
		String strnum2 = args[1];
		
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}
}
