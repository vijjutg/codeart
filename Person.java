class Person
{
	static void work(String company, double salary)
	{
		if (company == "Capgameni" && salary == 3.5)
		{
		System.out.println("Capgameni company gives 3.5 lpa salary");
		return;
		}
	}
	static void work(String company, double salary, String designation)
	{
		if (company == "Infosys" && salary == 3.8 && designation == "Software developer")
		{
			System.out.println("Infosys gives 3.8 lpa package for software developer role");
			return;
		}
		
	}
	
}