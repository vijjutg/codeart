class MovieOperatorRunner
{
	public static void main(String[] movie)
	{
		System.out.println("main started");
		
		MovieDataOperator.save("Tiru");
		
		MovieDataOperator.save("Lucky Man");
		
		MovieDataOperator.save("Love Mocktail");
		
		MovieDataOperator.save("Vikrant Rona");
		
		MovieDataOperator.save("YUvaratna");
		
		MovieDataOperator.displayDetails();
		
		System.out.println("main completed");
	}
}