class DayWeek
{
	public static void main(String[] args)
	{
		int day=8;
		switch(day)
		{
			case 1: System.out.println("Monday");
			switch(day)
			{
			   case 1: System.out.println("Weekday");
			}
			break;
			
			case 2: System.out.println("Tuesday");
			switch(day)
			{
			   case 2: System.out.println("Weekday");
			}
			break;
			case 3: System.out.println("Wednesday");
			switch(day)
			{
			   case 3: System.out.println("Weekday");
			}
			break;
			case 4: System.out.println("Thursday");
			switch(day)
			{
			   case 4: System.out.println("Weekday");
			}
			break;
			case 5: System.out.println("Friday");
			switch(day)
			{
			   case 5: System.out.println("Weekday");
			}
			break;
			case 6: System.out.println("Saturday");
			switch(day)
			{
			   case 6: System.out.println("Weekend");
			}
			break;
			case 7: System.out.println("Sunday");
			switch(day)
			{
			   case 7: System.out.println("Weekend");
			}
			break;
			default:
			System.out.println("Invalid Input");
			
		}
	}
}