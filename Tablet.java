class Tablet
{
	static String type;
	static  int color;
	static char size;
	static double price;
	static double height;
	static double width;
	static String shape;
	static int capacity;
	static double wiegth;
	static boolean withCover;
	static long tabCode;
	static boolean isSafe;
	static String suggest;
	static String whenToTake;
	static String taste;
	static String whoToTake;
	static boolean byTwo;
	
	static String[] colors;
	static String[] names;
	static String[] users;
	static String[] ingredients;
	static double[] quantities;
	static String[] companies;
	static String[] places;
	static boolean[] cure;
	static String[] availability;
	static String[] forms;
	 
	static void printProperties()
	{
		System.out.println(type);
		System.out.println(color);
	    System.out.println(size);
        System.out.println(price);
        System.out.println(height);
		System.out.println(width);
		System.out.println(shape);
		System.out.println(capacity);
		System.out.println(wiegth);
		System.out.println(withCover);
		System.out.println(tabCode);
		System.out.println(isSafe);
		System.out.println(suggest);
		System.out.println(whenToTake);
		System.out.println(taste);
		System.out.println(whoToTake);
		System.out.println(byTwo);

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
		  System.out.println("colors is null");
	  }
	  
	  if (names!=null)
	  {
	      for (int index=0; index<names.length; index++)
	        {
		      String ref = names[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("names is null");
	  }
	  
	  if (users!=null)
	  {
	      for (int index=0; index<users.length; index++)
	        {
		      String ref = users[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("users is null");
	  }
	  
	  if (ingredients!=null)
	  {
	      for (int index=0; index<ingredients.length; index++)
	        {
		      String ref = ingredients[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("ingredients is null");
	  }
	  
	  if (quantities!=null)
	  {
	      for (int index=0; index<quantities.length; index++)
	        {
		      double ref = quantities[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("quantities is null");
	  }
	  
	  if (companies!=null)
	  {
	      for (int index=0; index<companies.length; index++)
	        {
		      String ref = companies[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("companies is null");
	  }
	  
	  if (places!=null)
	  {
	      for (int index=0; index<places.length; index++)
	        {
		      String ref = places[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("places is null");
	  }
	  
	  if (cure!=null)
	  {
	      for (int index=0; index<cure.length; index++)
	        {
		      boolean ref = cure[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("cure is null");
	  }
	  
	  if (availability!=null)
	  {
	      for (int index=0; index<availability.length; index++)
	        {
		      String ref = availability[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("availability is null");
	  }
	  
	  if (forms!=null)
	  {
	      for (int index=0; index<forms.length; index++)
	        {
		      String ref = forms[index];
		      System.out.println(ref);
	        }
	  }
	  else
	  {
		  System.out.println("forms is null");
	  }
	}
	
}