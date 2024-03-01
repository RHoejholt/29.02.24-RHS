public class Team{
	private String teamName;
	private int rank;
	private String playerName;
	private ArrayList<String> teamSheet = new ArrayList<>();

	public Team(String teamName){
		this.teamName = teamName;

	}

	public String getTeamName() {
		return teamName;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public void addPlayer(String playerName){
		teamSheet.add(playerName);
	}

	public String toString(){
		String output = "Hold: " + this.teamName + " \nRang " + this.rank + " \nHold kort: ";
		for(String playerName : teamSheet){
			output += "\n       " + playerName + "*";
		}
		return output;
	}
}