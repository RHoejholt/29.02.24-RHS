import java.util.ArrayList;

public class GameMenu{
	private ArrayList<String> actions = new ArrayList<>();
	
	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;




	}	

	public void displayMenu() {
		for (String action : actions){
		System.out.println(action);

	}
	}



}