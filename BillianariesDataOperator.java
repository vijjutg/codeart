class BillianariesDataOperator
{
	static String[] biliianriesName = {null,null,null,null,null,null,null,null,null,null};
	
	static int position=0;
	
	static void save(String nameOfBillianarie)
	{
		
		if (position >= biliianriesName.length)
		{
			System.out.println("Name is exceeded");
			return;
		}
		if (nameOfBillianarie != null && nameOfBillianarie.length()>4)
		{
			biliianriesName[position] = nameOfBillianarie;
			position++;
			System.out.println("The name of billianarie entered is : "+ nameOfBillianarie);
		}
		else
		{
			System.out.println("The name is not valid");
		}
	}
	
	static void displayDetails()
	{
		for (int index=0; index<biliianriesName.length; index++)
		{
			String ref = biliianriesName[index];
			System.out.println("Name of billianarie is : " + ref + " at index : " + index);
		}
	}
	
	static boolean find(String billianaries)
	{
		if (billianaries != null && billianaries.length()>4)
		{
			System.out.println("Valid name");
			
			for (int find=0; find<biliianriesName.length; find++)
			{
				String ref = biliianriesName[find];
				if (ref == billianaries)
				{
					System.out.println("name found : " + ref + " at index : "+ find);
					return true;
				}
			}
		}
		else
		{
			System.out.println("Invalid name");
		}
		return false;
	}
	
	static String upDate(String oldBillianarie, String newBillianarie)
	{
		if (oldBillianarie != null && newBillianarie !=null)
		{
			if (oldBillianarie.length()>4 && newBillianarie.length()>4)
			{
				System.out.println("valid names");
				for (int point=0; point<biliianriesName.length; point++)
				{
					String ref1 = biliianriesName[point];
					if (ref1 == oldBillianarie)
					{
						biliianriesName[point] = newBillianarie;
						System.out.println("new billianarie name is : " + biliianriesName[point]);
						return newBillianarie;
					}
				}
			}
			else
			{
				System.out.println("Names are not valid");
			}
		}
		return null;
	}
	
	static String upDate(int index, String newBillianarie)
	{
		if (index<biliianriesName.length && newBillianarie != null && newBillianarie.length()>4)
		{
			System.out.println("new name is valid");
			for (int pos=0; pos<biliianriesName.length; pos++)
			{
				if (index == pos)
				{
					biliianriesName[pos] = newBillianarie;
					return newBillianarie;
				}
			}
		}
		else
		{
			System.out.println("index and new name are not valis");
		}
		return null;
	}
	
	static boolean delete(String billianarie)
	{
		
		for (int find=0; find<biliianriesName.length; find++)
		{
			String ref = biliianriesName[find];
			
			if (ref == billianarie)
			{
				System.out.println("name going to delete is : "+ ref);
		    	biliianriesName[find] = null;
				return true;
			}
		
		}
		return false;
	}
	
	static boolean delete(int index, String billianarie)
	{
		
		for (int pos=0; pos<biliianriesName.length; pos++)
		{
			String ref = biliianriesName[pos];
			if (index == pos)
			{
				System.out.println("the name going to delete at index is : "+ pos);
			    biliianriesName[pos] = null;
				return true;
			}
		}
		return false;
	}
}