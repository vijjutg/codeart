class TempleDataOperator
{
		
	static String[] namesOfGods = {null,null,null,null,null};
	
	static int index = 0;
	
	static void save(String godName)
	{
		namesOfGods[index] = godName;
		System.out.println("Name of god at index " + index + " is " + godName);
		index++;
		System.out.println("next index available is : "+ index);
	}
	
	static void displayDetails()
	{
		for (int pos=0; pos<namesOfGods.length; pos++)
		{
			String ref = namesOfGods[pos];
			System.out.println("Name is : "+ ref);
		}
	}
}