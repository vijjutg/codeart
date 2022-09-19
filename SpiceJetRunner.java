class SpiceJetRunner
{
	public static void main(String [] flight)
	{
		System.out.println("Running main method");
		String[] flightno = {"DF2753", "LN3211", "GT4638", "KV3323", "LX3100", "LV2317", "BD9032", "FB5610", "EN4267", "GC5433"};
        SpiceJet.flightNos(flightno);		
	}
}