import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String color, food, animal, name;

		System.out.println("What is your favorite color? ");
		color = scan.nextLine();
		System.out.println("What is your favorite food? ");
		food = scan.nextLine();
		System.out.println("What is your favorite animal? ");
		animal = scan.nextLine();
		System.out.println("What is your name? ");
		name = scan.nextLine();

		System.out
				.println("I had a dream that " + name + " ate a " + color + " "
						+ animal + "\n" + "and said it tasted like " + food + "!");
	}

}
