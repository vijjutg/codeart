class ColorsDataOperator
{
	static String[] colorNames = {null,null,null,null,null,null,null};
	
	static int position = 0;
	
	static void save(String color)
	{
	
	if (position>=colorNames.length)
	    {
		    System.out.println("Color name exceeds");
		    return;
	    }
		
	if (color!=null && color.length()>3)
	{
	    colorNames[position] = color;
		position++;
		System.out.println("Color name is : "+ color);
		
	}
	else
	{
		System.out.println("Invalid name : "+ color);
		return;
	}
	
	}
	
	static void displayDetails()
	{
		for (int index=0; index<colorNames.length; index++)
		{
			String ref = colorNames[index];
			System.out.println("Color name at index : "+ index + "is : " + ref);
		}
	}
	static boolean findColor(String name)
	{
		
	    for (int find=0; find<colorNames.length; find++)
	    {
		    String ref1 = colorNames[find];
	        if (ref1==name)
	        {
		       System.out.println("Color found " +name);
		        return true;
	        }
	    }
		return false;
	}
}