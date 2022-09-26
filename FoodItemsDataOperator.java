class FoodItemsDataOperator
{
	static String[] namesOfFoodItems = {null,null,null,null,null};
	
	static int position = 0;
	
	static void save(String foodItemName)
	{
		namesOfFoodItems[position] = foodItemName;
		System.out.println("Name of food item at index " + position + " is " + foodItemName);
		position++;
		System.out.println("next index available is : "+ position);
	}
	
	static void displayDetails()
	{
		for (int pos=0; pos<namesOfFoodItems.length; pos++)
		{
			String ref = namesOfFoodItems[pos];
			System.out.println("Name is : "+ ref);
		}
	}
}