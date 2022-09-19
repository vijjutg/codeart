class SportsRunner
{
	public static void main(String[] sport)
	{
		System.out.println("Running main method");
		String[] names = {"Shikar Dhavan", "Rohit Sharma", "Suresh Raina", "Virat Kohli", "MS Dhoni", "Ravindra Jadeja", "Shami", "Bhuvaneshwar Kumar", "Yujuvendra Chahal", "Umesh Yadav"};
		Sports.cricketTeamMembers(names);
		
		int[] nos = {2,45,7,34,72,99,63,18,24,4};
		Sports.kabaddiTeamMembersJerseyNos(nos);
		
		double[] salary = {23,5,7,18,3.4,7.8,29.4,5.9,28,63,};
		Sports.footBallTeamMembersSalary(salary);
		
		long[] no = {8263764733l,9273252418l,6272891113l,9182671536l,7022454703l,7760945581l,8123664200l,7852364562l,9900445566l,8927547238l};
		Sports.ludoTeamMobileNumber(no);
		
		int[] matches = {25,92,73,51,15,82,63,53,26,37};
		Sports.hockyTeamMembersNoOfMatches(matches);
		
		long[] code = {573822l,294792l,8172649l,8274518l,872649l,5973879l,52974392l,572374791l,5487263l,9825471l};
		Sports.kokoTeamMembersCountryCode(code);
		
		boolean[] name = {true,false,false,true,true,true,false,true,true,true};
		Sports.lagoriTeamMembersAlive(name);
	}
}