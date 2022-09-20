class Card
{
	static String type;
	static double height;
	static double width;
	static double price;
	static String[] colors;
	static void displayDetails()
	{
	  System.out.println(type);
	  System.out.println(height);
	  System.out.println(width);
	  System.out.println(price);
	 
	  if (colors!=null)
	  {
	      for (int index=0; index<colors.length; index++)
	        {
		      String ref = colors[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("Colors is null");
	  }
	}
}