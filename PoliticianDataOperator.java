 class PoliticianDataOperator
 {
	 static String[] namesOfPolitician = {null,null,null,null,null};
	
	static int index = 0;
	
	static void save(String politicianName)
	{
		namesOfPolitician[index] = politicianName;
		System.out.println("Name of politician at index " + index + " is " + politicianName);
		index++;
		System.out.println("next index available is : "+ index);
	}
	
	static void displayDetails()
	{
		for (int pos=0; pos<namesOfPolitician.length; pos++)
		{
			String ref = namesOfPolitician[pos];
			System.out.println("Name is : "+ ref);
		}
	}
 }