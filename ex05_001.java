package chapter05;

public class ex05_001 {
	public static void main(String[] args)
	{
		String str01 = "�Ź�ö";
		String str02 = "�Ź�ö";
		
		if(str01 == str02)
		{
			System.out.println("Str01��Str02�� ������ ����");
		}
		else
		{
			System.out.println("Str01��Str02�� ������ �ٸ�");
		}
		
		if(str01.equals(str02))
		{
			System.out.println("Str01��Str02�� ���ڿ��� ����");
		}
		String str03 = new String("�Ź�ö");
		String str04 = new String("�Ź�ö");
		
		if(str03 == str04)
		{
			System.out.println("Str03��Str04�� ������ ����");
		}
		else
		{
			System.out.println("Str03��Str04�� ������ �ٸ�");
		}
		
		if(str03.equals(str04))
		{
			System.out.println("Str03��Str04�� ���ڿ��� ����");
		}
	}
}
