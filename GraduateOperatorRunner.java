class GraduateOperatorRunner
{
	public static void main(String[] student)
	{
		System.out.println("main started");
		
		GraduateDataOperator.save("Vijayalakshmi");
		
		GraduateDataOperator.save("Kavya");
		
		GraduateDataOperator.save("Afreen");
		
		GraduateDataOperator.save("Rashmi");
		
		GraduateDataOperator.save("Pooja");
		
		GraduateDataOperator.displayDetails();
		
		System.out.println("main completed");
	}
}