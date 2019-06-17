package chapter05;

public class ex05_012 {
	public static void main(String[] args)
	{
		ex05_011_1 today = ex05_011_1.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		ex05_011_1 day1 = ex05_011_1.MONDAY;
		ex05_011_1 day2 = ex05_011_1.WENSDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		ex05_011_1 weekday = ex05_011_1.valueOf("SUNDAY");
		
		if(weekday == ex05_011_1.SATURDAY || weekday == ex05_011_1.SUNDAY)
		{
			System.out.println("주말 이군요");						
		}
		else
		{
			System.out.println("평일 이군요");	
		}
		ex05_011_1[] days = ex05_011_1.values();
		
		for(ex05_011_1 day: days)
		{
			System.out.println(day);
		}
	}
}
