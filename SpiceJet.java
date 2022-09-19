class SpiceJet
{
	static void flightNos(String[] flightno)
	{
		System.out.println("Number of flights :"+ flightno.length);
		for (int index=0; index<flightno.length; index++)
		{
			String ref = flightno[index];
			System.out.println("Flight number is :"+ ref);
		}
	}
}