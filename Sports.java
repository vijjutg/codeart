class Sports
{
	static void cricketTeamMembers(String[] names)
	{
	System.out.println("Number of players : "+ names.length);
	for (int index=0; index<names.length; index++)
	{
		String ref = names[index];
		System.out.println("name of the player is : "+ ref);
	}
	}
	
	static void kabaddiTeamMembersJerseyNos(int[] nos)
	{
		System.out.println("Number of players :"+ nos.length);
		for (int index=0; index<nos.length; index++)
	   {
		int ref = nos[index];
		System.out.println("jersey number of the player is : "+ ref);
	   }
	}
	
	static void footBallTeamMembersSalary(double[] salary)
	{
		System.out.println("Number of players :"+ salary.length);
		for (int index=0; index<salary.length; index++)
	   {
		double ref = salary[index];
		System.out.println("salary of the player is : "+ ref);
	   }
	}
	
	static void ludoTeamMobileNumber(long[] no)
	{
		System.out.println("Number of players :"+ no.length);
		for (int index=0; index<no.length; index++)
	   {
		long ref = no[index];
		System.out.println("mobile number of the player is : "+ ref);
	   }
	}
	static void hockyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("Number of players :"+ matches.length);
		for (int index=0; index<matches.length; index++)
	   {
		int ref = matches[index];
		System.out.println("nuber of matches of player is : "+ ref);
	   }
	}
	
	static void kokoTeamMembersCountryCode(long[] code)
	{
		System.out.println("Number of players :"+ code.length);
		for (int index=0; index<code.length; index++)
	   {
		long ref = code[index];
		System.out.println("player country code is : "+ ref);
	   }
	}
	
	static void lagoriTeamMembersAlive(boolean[] name)
	{
		System.out.println("Number of players :"+ name.length);
		for (int index=0; index<name.length; index++)
	   {
		boolean ref = name[index];
		System.out.println("player is alive : "+ ref);
	   }
	}
}