package chapter05;

import java.util.Calendar;

public class ex05_011_2 {
	public static void main(String[] args)
	{
		ex05_011_1 today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week)
		{
		case 1: today = ex05_011_1.SUNDAY;break;
		case 2: today = ex05_011_1.MONDAY;break;
		case 3: today = ex05_011_1.TUESDAY;break;
		case 4: today = ex05_011_1.WENSDAY;break;
		case 5: today = ex05_011_1.THURSDAY;break;
		case 6: today = ex05_011_1.FRIDAY;break;
		case 7: today = ex05_011_1.SATURDAY;break;
		}
		
		System.out.println("���� ����:" + today);
		
		if(today == ex05_011_1.SUNDAY)
		{
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�");			
		}
		else
		{
			System.out.println("������ �ڹ� �����մϴ�");
		}
	}
}
