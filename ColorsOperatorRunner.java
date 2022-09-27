class ColorsOperatorRunner
{
	public static void main (String[] color)
	{
		System.out.println("main: started");
		
		ColorsDataOperator.save("White");
		
		ColorsDataOperator.save("Black");
		
		ColorsDataOperator.save("Green");
			
		ColorsDataOperator.save("Yellow");
		
		ColorsDataOperator.save("Blue");
		
		ColorsDataOperator.save("Orange");
		
		ColorsDataOperator.save("violet");
		
		ColorsDataOperator.save("Pink");
		
		ColorsDataOperator.save("Red");
		
		ColorsDataOperator.displayDetails();
		
		ColorsDataOperator.findColor("Oragne");
		
		ColorsDataOperator.findColor("Brown");
		
		System.out.println("main: ended");
	}
}