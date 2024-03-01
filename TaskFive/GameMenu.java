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

	public String getAction() {
		System.out.println("Type a number and choose an action.");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		return choice;
	}


}