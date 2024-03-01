import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		System.out.println("Please type your name");
		Scanner scanner = new Scanner(System.in);
		String input =  scanner.nextLine();
		String name = input;
		System.out.println("Hello " + name + ", Please type your age.");
		int input2 =  scanner.nextInt();
		int age = input2;
		System.out.println("Your age: " + age);
		int retAge = 67 - age;
		System.out.println("Your retirement age: " + retAge);




	}
}