import java.util.ArrayList;

class Main{
	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu actionsList = new GameMenu(actions);

		actionsList.displayMenu();

		String userChoice = actionsList.getAction();

		System.out.println(userChoice);
	}
}