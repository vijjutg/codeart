class FoodItemsOperatorRunner
{
	public static void main(String[] snacks)
	{
		System.out.println("main started");
		
		FoodItemsDataOperator.save("Jeeara Rice");
		
		FoodItemsDataOperator.save("Roti");
		
		FoodItemsDataOperator.save("Masala Rice");
		
		FoodItemsDataOperator.save("Palav");
		
		FoodItemsDataOperator.save("Rice Sambar");
		
		FoodItemsDataOperator.displayDetails();
		
		System.out.println("main ended");
	}
}