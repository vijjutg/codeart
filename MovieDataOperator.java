class MovieDataOperator
{
	static String[] namesOfMovies = {null,null,null,null,null};
	
	static int position = 0;
	
	static void save(String movieName)
	{
		namesOfMovies[position] = movieName;
		System.out.println("Name of movie at index " + position + " is " + movieName);
		position++;
		System.out.println("next index available is : "+ position);
	}
	
	static void displayDetails()
	{
		for (int pos=0; pos<namesOfMovies.length; pos++)
		{
			String ref = namesOfMovies[pos];
			System.out.println("Name is : "+ ref);
		}
	}
}