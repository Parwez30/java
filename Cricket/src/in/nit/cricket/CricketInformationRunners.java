package in.nit.cricket;


public class CricketInformationRunners {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		CricketInformation parwez = new CricketInformation();
		System.out.println("Cricket Information:"+parwez);
		parwez.team = "India";
		parwez.numberOfPlayers = 11;
		parwez.numberOfBatters = 5;
		parwez.numberofBallers = 5;
		parwez.numberOfAllRounders = 1;
		parwez.headcoach = "Gautam Gambhir";
		parwez.bowlingcoach ="Morne Morkel";
		parwez.captain = "Rohit Sharma";
		parwez.vicecaptain = "Shubman Gill";
		parwez.owner = "BCCI";
		System.out.println("team:"+parwez.team);
		System.out.println("numberOfPlayers:"+parwez.numberOfPlayers);
		System.out.println("numberOfBatters:"+parwez.numberOfBatters);
		System.out.println("numberofBallers:"+parwez.numberofBallers);
		System.out.println("numberOfAllRounders:"+parwez.numberOfAllRounders);
		System.out.println("headcoach:"+parwez.headcoach);
		System.out.println("bowlingcoach:"+parwez.bowlingcoach);
		System.out.println("captain:"+parwez.captain);
		System.out.println("vicecaptain:"+parwez.vicecaptain);
		System.out.println("owner:"+parwez.owner);
		

	}

}
