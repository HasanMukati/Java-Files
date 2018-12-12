
public class Month {


		int monthNumber;
		Month()
	{
		monthNumber = 1;
		}
		public Month(int num)
		{
		setMonthNumber(num);
		}
		

		Month(String str)
		{
		if(str.equalsIgnoreCase("January")) monthNumber = 1;
		else if(str.equalsIgnoreCase("February")) monthNumber = 2;
		else if(str.equalsIgnoreCase("March")) monthNumber = 3;
		else if(str.equalsIgnoreCase("April")) monthNumber = 4;
		else if(str.equalsIgnoreCase("May")) monthNumber = 5;
		else if(str.equalsIgnoreCase("June")) monthNumber = 6;
		else if(str.equalsIgnoreCase("July")) monthNumber = 7;
		else if(str.equalsIgnoreCase("August")) monthNumber = 8;
		else if(str.equalsIgnoreCase("September")) monthNumber = 9;
		else if(str.equalsIgnoreCase("October")) monthNumber = 10;
		else if(str.equalsIgnoreCase("November")) monthNumber = 11;
		else if(str.equalsIgnoreCase("December")) monthNumber = 12;
		else monthNumber = 1;
		}
		
		public void setMonthNumber(int num)
	{
		if(num < 1 || num > 12)
		monthNumber = 1;
		else
		monthNumber = num;
	}
		int getMonthNumber()
	{
		return monthNumber;
		}
		public String getMonthName()
	{
		String[] array = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		return array[monthNumber-1];
		}
		public String toString()
		{
		return getMonthName();
		}
		public boolean equals(Month M)
		{
		return (monthNumber == M.monthNumber);
		}
		public boolean greaterThan(Month M)
		{
		return (monthNumber > M.monthNumber);
		}
		public boolean lessThan(Month M){
		return (monthNumber < M.monthNumber);
	}
}

		