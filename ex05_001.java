package chapter05;

public class ex05_001 {
	public static void main(String[] args)
	{
		String str01 = "신민철";
		String str02 = "신민철";
		
		if(str01 == str02)
		{
			System.out.println("Str01과Str02는 참조가 같음");
		}
		else
		{
			System.out.println("Str01과Str02는 참조가 다름");
		}
		
		if(str01.equals(str02))
		{
			System.out.println("Str01과Str02는 문자열이 같음");
		}
		String str03 = new String("신민철");
		String str04 = new String("신민철");
		
		if(str03 == str04)
		{
			System.out.println("Str03과Str04는 참조가 같음");
		}
		else
		{
			System.out.println("Str03과Str04는 참조가 다름");
		}
		
		if(str03.equals(str04))
		{
			System.out.println("Str03과Str04는 문자열이 같음");
		}
	}
}
