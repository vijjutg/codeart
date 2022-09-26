class TempleOperatorRunner
{
	public static void main(String[] god)
	{
		System.out.println("main started");
		
		TempleDataOperator.save("Ganesha");
		
		TempleDataOperator.save("Shiva");
		
		TempleDataOperator.save("Hanumanta");
		
		TempleDataOperator.save("Veerabhadreshwara");
		
		TempleDataOperator.save("Kannika Parameshwari");
		
		TempleDataOperator.displayDetails();
		
		System.out.println("main ended");
	}
}