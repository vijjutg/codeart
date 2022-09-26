class PoliticianOperatorRunner
{
	public static void main(String[] politics)
	{
		System.out.println("main started");
		
		PoliticianDataOperator.save("Narendra Modi");
		
		PoliticianDataOperator.save("Yadiyurappa");
		
		PoliticianDataOperator.save("SiddaRamayya");
		
		PoliticianDataOperator.save("Basavaraja Bommayi");
		
		PoliticianDataOperator.save("KumaraSwami");
		
		PoliticianDataOperator.displayDetails();
		
		System.out.println("");
	}
}