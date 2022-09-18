class Vehicle 
{
	static double transport(String source, String destination)
	{
		if (source == "Kudligi" && destination == "Bangalore")
		{
			System.out.println("travelling from kudligi to bangalore");
			return 150;
		}
		return 0.0;
	}
	
	static double transport(String source, String destination, boolean ontime)
	{
		if (source == "Mysore" && destination == "Mandya" && ontime == true)
		{
			System.out.println("Reached ontime to mandya from mysore");
			return 62.4;
		}
		return 0.0;
	}
	
	static boolean transport(String destination)
	{
		if (destination == "Udupi")
		{
			System.out.println("destination is udupi");
			return false;
		}
		return true;
	}
	
	static boolean transport(String destination, boolean ontime)
	{
		if (destination == "Delhi" && ontime == false)
		{
			System.out.println("destination is delhi but not reached ontime");
			return true;
		}
		return false;
	}
	
	static boolean transport(boolean ontime)
	{
		ontime = true;
		return false;
	}
}